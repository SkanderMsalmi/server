package tn.esprit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.Departement;
import tn.esprit.service.interfaces.DepartementService;

@RestController
@RequestMapping("/ControleurDepartement")
public class DepartementController {
	@Autowired
	DepartementService DServ;
	
	@GetMapping("/displayDepartement")
	public Departement displayDepartement(int id) {
		return DServ.retrieveDepartement(id);
	}

	
	@GetMapping("/displayDepartements")
	public List<Departement> displayAllDepartements(){
		return DServ.retrieveAllDepartements();
	}
	
	@PostMapping("/addDepartement")
	public Departement addDepartement( @RequestBody Departement e) {
		return DServ.addDepartement(e);
	}
	
	@PutMapping("/updateDepartement")
	public Departement updateDepartement(@RequestBody Departement e) {
		return DServ.updateDepartement(e);
	}
	
	@DeleteMapping("/deleteDepartement")
	public void deleteDepartement(int id) {
		DServ.removeDepartement(id);
	}
	
	//Chaque jour 11h et répéte avec un intervalle de 30 minutes

	@GetMapping("getDepByNom/{nomDepart}")
	public List<Departement> getDepartementsByNom(@PathVariable String nomDepart){
		return DServ.getDepartementsByNom(nomDepart);
	}
	
	@GetMapping("getDepById/{idDepart}")
	public List<Departement> getDepartementById(@PathVariable Integer idDepart){
		return DServ.getDepartementById(idDepart);
	}
}
