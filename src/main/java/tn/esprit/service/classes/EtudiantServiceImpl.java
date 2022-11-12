package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.Etudiant;
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

}
