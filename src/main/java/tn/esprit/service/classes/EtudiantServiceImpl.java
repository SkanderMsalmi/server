package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.Departement;
import tn.esprit.persistance.entities.Etudiant;
import tn.esprit.persistance.entities.Option;
import tn.esprit.persistance.repositories.EtudiantRepository;
import tn.esprit.service.interfaces.EtudiantService;

@Service
@Slf4j
public class EtudiantServiceImpl implements EtudiantService{
	@Autowired
	EtudiantRepository etudRep;

	@Override
	public List<Etudiant> retrieveAllEtudiants() {
		List<Etudiant> etudiants = (List<Etudiant>)etudRep.findAll();
		
		return etudiants ;
	}

	@Override
	public Etudiant addEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		log.info("Etudiant Ajoutée"+e);
		return etudRep.save(e);
		
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		log.info("Etudiant modifie"+e);
		etudRep.save(e);
		return e;
	}

	@Override
	public Etudiant retrieveEtudiant(Integer idEtudiant) {
		// TODO Auto-generated method stub
				Etudiant e = etudRep.findById(idEtudiant).get();
				log.info("Etudiant trouve "+e);
				return e;
	}

	@Override
	public void removeEtudiant(Integer idEtudiant) {
		// TODO Auto-generated method stub
				etudRep.deleteById(idEtudiant);
	}

	@Override
	public List<Etudiant> findByNomE(String nomE) {
		// TODO Auto-generated method stub
		return etudRep.findByNomE(nomE);
	}

	@Override
	public List<Etudiant> findByPrenomE(String prenomE) {
		// TODO Auto-generated method stub
		return etudRep.findByPrenomE(prenomE);
	}

	@Override
	public List<Etudiant> findByOp(Option op) {
		// TODO Auto-generated method stub
		return etudRep.findByOp(op);
	}

	@Override
	public List<Etudiant> findByDepartement(Departement departement) {
		// TODO Auto-generated method stub
		return etudRep.findByDepartement(departement);
	}

	@Override
	public List<Etudiant> getAllStudnetsUsingJPQL() {
		// TODO Auto-generated method stub
		return etudRep.getAllStudentsUsingJPQL();
	}

	@Override
	public List<Etudiant> getAllStudentsByNomUsingJPQL(String nom) {
		// TODO Auto-generated method stub
		return etudRep.getStudentsByNom(nom);
	}
	
	

}
