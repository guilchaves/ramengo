package br.com.guilchaves.ramengo.controller;

import br.com.guilchaves.ramengo.dto.ProteinDTO;
import br.com.guilchaves.ramengo.service.ProteinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/proteins")
public class ProteinController {

    @Autowired
    private ProteinService service;

    @GetMapping
    public ResponseEntity<List<ProteinDTO>> findAll(){
        List<ProteinDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
