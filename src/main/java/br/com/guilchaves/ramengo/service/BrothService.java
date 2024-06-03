package br.com.guilchaves.ramengo.service;

import br.com.guilchaves.ramengo.dto.BrothDTO;
import br.com.guilchaves.ramengo.dto.ProteinDTO;
import br.com.guilchaves.ramengo.entities.Broth;
import br.com.guilchaves.ramengo.entities.Protein;
import br.com.guilchaves.ramengo.repository.BrothRepository;
import br.com.guilchaves.ramengo.repository.ProteinRepository;
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

}
