package br.com.guilchaves.ramengo.controller;

import br.com.guilchaves.ramengo.dto.BrothDTO;
import br.com.guilchaves.ramengo.dto.ProteinDTO;
import br.com.guilchaves.ramengo.service.BrothService;
import br.com.guilchaves.ramengo.service.ProteinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/broths")
public class BrothController {

    @Autowired
    private BrothService service;

    @GetMapping
    public ResponseEntity<List<BrothDTO>> findAll(){
        List<BrothDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

}
