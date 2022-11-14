package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.persistance.entities.Departement;
import tn.esprit.persistance.repositories.DepartementRepository;
import tn.esprit.service.interfaces.DepartementService;

@Service
@Slf4j
public class DepartementServiceImpl implements DepartementService{

	@Autowired
	DepartementRepository depRep;
	
	@Override
	public List<Departement> retrieveAllDepartements() {
		List<Departement> departements = (List<Departement>) depRep.findAll();
		for (Departement e : departements) {
			log.info("Departement : "+e);
		}
		return departements;
	}

	@Override
	public Departement addDepartement(Departement e) {
		// TODO Auto-generated method stub
		return depRep.save(e);
	}

	@Override
	public Departement updateDepartement(Departement e) {
		// TODO Auto-generated method stub
		return depRep.save(e);
	}

	@Override
	public Departement retrieveDepartement(Integer idDepartement) {
		// TODO Auto-generated method stub
		return depRep.findById(idDepartement).get();
	}

	@Override
	public void removeDepartement(Integer idDepartement) {
		// TODO Auto-generated method stub
		depRep.deleteById(idDepartement);
	}

	@Override
	public List<Departement> getAllDepartementsUsingJPQL() {
		// TODO Auto-generated method stub
		return depRep.getAllDepartementsUsingJPQL();
	}


}
