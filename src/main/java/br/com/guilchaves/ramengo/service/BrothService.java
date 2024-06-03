package br.com.guilchaves.ramengo.service;

import br.com.guilchaves.ramengo.dto.BrothDTO;
import br.com.guilchaves.ramengo.entities.Broth;
import br.com.guilchaves.ramengo.repository.BrothRepository;
import br.com.guilchaves.ramengo.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrothService {

    @Autowired
    private BrothRepository repository;

    @Transactional(readOnly = true)
    public List<BrothDTO> findAll(){
        List<Broth> list = repository.findAll();
        return list.stream().map(BrothDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public BrothDTO getBrothById(String id) {
        Broth broth = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Broth not found"));
        return new BrothDTO(broth);
    }
}
