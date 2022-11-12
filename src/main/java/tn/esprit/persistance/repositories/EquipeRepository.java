package tn.esprit.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.persistance.entities.Equipe;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer>{

}
