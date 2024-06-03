package br.com.guilchaves.ramengo.service;

import br.com.guilchaves.ramengo.dto.BrothDTO;
import br.com.guilchaves.ramengo.dto.ProteinDTO;
import br.com.guilchaves.ramengo.entities.Broth;
import br.com.guilchaves.ramengo.entities.Protein;
import br.com.guilchaves.ramengo.repository.ProteinRepository;
import br.com.guilchaves.ramengo.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProteinService {

    @Autowired
    private ProteinRepository repository;

    @Transactional(readOnly = true)
    public List<ProteinDTO> findAll(){
        List<Protein> list = repository.findAll();
        return list.stream().map(ProteinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ProteinDTO getProteinById(String id) {
        Protein protein = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Protein not found"));
        return new ProteinDTO(protein);
    }

}
