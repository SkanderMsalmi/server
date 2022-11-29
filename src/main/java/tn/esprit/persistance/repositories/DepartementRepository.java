package tn.esprit.persistance.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer>{
	
	
	@Query("select d from Departement d")
	List<Departement> getAllDepartementsUsingJPQL();
	
	@Query("select d from Departement d WHERE d.nomDepart = :nomDepart")
	List<Departement> getDepartementsByNom(@Param("nomDepart")String nomDepart);
	
	@Query("select d from Departement d WHERE d.idDepart = :idDepart")
	List<Departement> getDepartementById(@Param("idDepart")Integer idDepart);
}
