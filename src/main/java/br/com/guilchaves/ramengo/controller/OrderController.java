package br.com.guilchaves.ramengo.controller;

import br.com.guilchaves.ramengo.config.RestTemplateConfig;
import br.com.guilchaves.ramengo.controller.exceptions.InvalidRequestException;
import br.com.guilchaves.ramengo.dto.BrothDTO;
import br.com.guilchaves.ramengo.dto.OrderRequestDTO;
import br.com.guilchaves.ramengo.dto.OrderResponseDTO;
import br.com.guilchaves.ramengo.dto.ProteinDTO;
import br.com.guilchaves.ramengo.entities.OrderId;
import br.com.guilchaves.ramengo.service.BrothService;
import br.com.guilchaves.ramengo.service.ProteinService;
import br.com.guilchaves.ramengo.service.exceptions.InternalServerErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpMethod.POST;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private BrothService brothService;

    @Autowired
    private ProteinService proteinService;

    @Autowired
    RestTemplateConfig restTemplateConfig;

    @Value("${orderid.api.base-url}")
    private String orderidApiBaseUrl;

    @PostMapping
    @ResponseBody
    public ResponseEntity<OrderResponseDTO> placeOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        try {
            String url = orderidApiBaseUrl;
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-api-key", "ZtVdh8XQ2U8pWI2gmZ7f796Vh8GllXoN7mr0djNf");
            HttpEntity<OrderId> entity = new HttpEntity<OrderId>(headers);
            OrderId orderId = restTemplateConfig.restTemplate().exchange(url, POST, entity, OrderId.class).getBody();

            if (orderId == null) {
                throw new RuntimeException("Failed to fetch order ID");
            }

            if (orderRequestDTO.getBrothId() == null || orderRequestDTO.getProteinId() == null) {
                throw new InvalidRequestException("both brothId and proteinId are required");
            }

            BrothDTO broth = brothService.getBrothById(orderRequestDTO.getBrothId());
            ProteinDTO protein = proteinService.getProteinById(orderRequestDTO.getProteinId());

            String description = broth.getName() + " and " + protein.getName() + " Ramen";

            OrderResponseDTO responseDTO = new OrderResponseDTO(orderId.getOrderId(), description, "https://tech.redventures.com.br/icons/ramen/ramen" + protein.getName() + ".png");
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        } catch (Exception e){
            throw new InternalServerErrorException("could not place order");
        }
    }
}