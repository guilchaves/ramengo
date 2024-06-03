package br.com.guilchaves.ramengo.service;

import br.com.guilchaves.ramengo.entities.Protein;
import br.com.guilchaves.ramengo.repository.ProteinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProteinService {

    @Autowired
    private ProteinRepository repository;

    @Transactional(readOnly = true)
    public List<Protein> findAll(){
        return repository.findAll();
    }

}
