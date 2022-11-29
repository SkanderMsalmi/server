package tn.esprit.persistance.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer>{
	
	@Query("SELECT c from Contrat c WHERE c.specialite = :spec")
	List<Contrat> retrieveContratBySpecialite(@Param("spec") String spec);
	
	@Query("SELECT c from Contrat c WHERE c.montantContrat = :montant")
	List<Contrat> retrieveContratByMontantContrat(@Param("montant") Integer montant);
	
	
}
