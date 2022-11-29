package tn.esprit.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.persistance.entities.Equipe;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer>{
	
	@Modifying
	@Query("update Equipe e set e.nomEquipe = :nomEquipe where e.idEquipe = :idEquipe")
	int updateNomEquipeById(@Param("nomEquipe") String nomEquipe,@Param("idEquipe") Integer idEquipe);
}
