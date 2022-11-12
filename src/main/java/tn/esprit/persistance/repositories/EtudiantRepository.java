package tn.esprit.persistance.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
