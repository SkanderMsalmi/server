package tn.esprit.persistance.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.persistance.entities.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer>{
	
	@Query("SELECT de from DetailEquipe de WHERE de.idDetailEquipe = :idDetailEquipe")
	List<DetailEquipe> retrieveContratById(@Param("idDetailEquipe") Integer idDetailEquipe);
	
	@Query("SELECT de from DetailEquipe de WHERE de.salle = :salle")
	List<DetailEquipe> retrieveContratBySalle(@Param("salle") Integer salle);
	
	@Query("SELECT de from DetailEquipe de WHERE de.thematique = :thematique")
	List<DetailEquipe> retrieveContratByThematique(@Param("thematique") String thematique);
}
