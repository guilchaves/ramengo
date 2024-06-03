package br.com.guilchaves.ramengo.repository;

import br.com.guilchaves.ramengo.entities.Protein;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProteinRepository extends JpaRepository<Protein, String> {
}
