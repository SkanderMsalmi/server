package tn.esprit.persistance.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer>{
	
	
	@Query("select d from Departement d")
	List<Departement> getAllDepartementsUsingJPQL();
}
