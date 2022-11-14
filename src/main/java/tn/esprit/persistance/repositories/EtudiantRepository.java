package tn.esprit.persistance.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.persistance.entities.Departement;
import tn.esprit.persistance.entities.Etudiant;
import tn.esprit.persistance.entities.Option;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{
	public List<Etudiant> findByIdEtudiant(Integer idEtudiant);
	List<Etudiant> findByNomE(String nomE);
	List<Etudiant> findByPrenomE(String prenomE);
	List<Etudiant> findByOp(Option op);
	List<Etudiant> findByDepartement(Departement departement);
	
	@Query("select e from Etudiant e ")
	public List<Etudiant> getAllStudentsUsingJPQL();
	
	@Query("select e from Etudiant e where e.nomE =:nom ")
	public List<Etudiant> getStudentsByNom(@Param("nom") String nom);
}
