package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.Contrat;
import tn.esprit.persistance.repositories.ContratRepository;
import tn.esprit.service.interfaces.ContratService;

@Service
@Slf4j
public class ContratServiceImpl implements ContratService {
	
	@Autowired
	ContratRepository contRep;
	
	@Override
	public List<Contrat> retrieveAllContrats() {
		List<Contrat> contrats = (List<Contrat>) contRep.findAll();
		for (Contrat e : contrats) {
			log.info("Contrat : "+e);
		}
		return contrats;
	}

	@Override
	public Contrat addContrat(Contrat e) {
		// TODO Auto-generated method stub
		return contRep.save(e);
	}

	@Override
	public Contrat updateContrat(Contrat e) {
		// TODO Auto-generated method stub
		return contRep.save(e);
	}

	@Override
	public Contrat retrieveContrat(Integer idContrat) {
		// TODO Auto-generated method stub
		return contRep.findById(idContrat).get();
	}

	@Override
	public void removeContrat(Integer idContrat) {
		contRep.deleteById(idContrat);
		
	}

}
