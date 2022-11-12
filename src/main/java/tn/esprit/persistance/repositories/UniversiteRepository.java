package tn.esprit.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer>{

}
