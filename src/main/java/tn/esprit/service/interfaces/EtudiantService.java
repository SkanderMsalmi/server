package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.persistance.entities.Departement;
import tn.esprit.persistance.entities.Etudiant;
import tn.esprit.persistance.entities.Option;

public interface EtudiantService {
	List<Etudiant> retrieveAllEtudiants();
	Etudiant addEtudiant(Etudiant e);
	Etudiant updateEtudiant(Etudiant e);
	Etudiant retrieveEtudiant(Integer idEtudiant);
	void removeEtudiant(Integer idEtudiant);
	List<Etudiant> findByNomE(String nomE);
	List<Etudiant> findByPrenomE(String prenomE);
	List<Etudiant> findByOp(Option op);
	List<Etudiant> findByDepartement(Departement departement);
	List<Etudiant> getAllStudnetsUsingJPQL();
	List<Etudiant> getAllStudentsByNomUsingJPQL(String nom);
}
