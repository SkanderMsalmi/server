package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.Universite;
import tn.esprit.persistance.repositories.UniversiteRepository;
import tn.esprit.service.interfaces.UniversiteService;

@Service
@Slf4j
public class UniversiteServiceImpl implements UniversiteService{


	@Autowired
	UniversiteRepository univRep;
	
	@Override
	public List<Universite> retrieveAllUniversites() {
		List<Universite> universites = (List<Universite>) univRep.findAll();
		for (Universite e : universites) {
			log.info("Universite : "+e);
		}
		return universites;
	}

	@Override
	public Universite addUniversite(Universite e) {
		// TODO Auto-generated method stub
		return univRep.save(e);
	}

	@Override
	public Universite updateUniversite(Universite e) {
		// TODO Auto-generated method stub
		return univRep.save(e);
	}

	@Override
	public Universite retrieveUniversite(Integer idUniversite) {
		// TODO Auto-generated method stub
		return univRep.findById(idUniversite).get();
	}

	@Override
	public void removeUniversite(Integer idUniversite) {
		// TODO Auto-generated method stub
		univRep.deleteById(idUniversite);
	}

	@Override
	public int deleteUniversiteByNomUniv(String nomUniv) {
		// TODO Auto-generated method stub
		univRep.deleteUniversiteByNomUniv(nomUniv);
		return 0;
	}
}
