package br.com.guilchaves.ramengo.controller;

import br.com.guilchaves.ramengo.config.RestTemplateConfig;
import br.com.guilchaves.ramengo.entities.OrderId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpMethod.POST;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    RestTemplateConfig restTemplateConfig;

    @Value("${orderid.api.base-url}")
    private String orderidApiBaseUrl;

    @PostMapping()
    @ResponseBody
    public OrderId callApiGetOrderId(){
        String url = orderidApiBaseUrl;

        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key", "ZtVdh8XQ2U8pWI2gmZ7f796Vh8GllXoN7mr0djNf");

        HttpEntity<OrderId> entity = new HttpEntity<OrderId>(headers);
        return restTemplateConfig.restTemplate().exchange(url, POST, entity, OrderId.class).getBody();
    }

}
