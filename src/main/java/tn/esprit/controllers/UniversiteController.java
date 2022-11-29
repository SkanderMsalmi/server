package tn.esprit.controllers;
import java.util.List;

import javax.persistence.TransactionRequiredException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.Universite;
import tn.esprit.service.interfaces.UniversiteService;

@Transactional
@RestController
@RequestMapping("/ControleurUniversite")
public class UniversiteController {
	@Autowired
	UniversiteService eServ;
	
	@GetMapping("/displayUniversite")
	public Universite displayUniversite(int id) {
		return eServ.retrieveUniversite(id);
	}
	
	@GetMapping("/displayUniversites")
	public List<Universite> displayAllUniversites(){
		return eServ.retrieveAllUniversites();
	}
	
	@PostMapping("/addUniversite")
	public Universite addUniversite( @RequestBody Universite e) {
		return eServ.addUniversite(e);
	}
	
	@PutMapping("/updateUniversite")
	public Universite updateUniversite(@RequestBody Universite e) {
		return eServ.updateUniversite(e);
	}
	
	@DeleteMapping("/deleteUniversite")
	public void deleteUniversite(int id) {
		eServ.removeUniversite(id);
	}
	
	@DeleteMapping("deleteUniversiteByNom/{nomUniv}")
	public int deleteUniversiteByNomUniv(@PathVariable String nomUniv) {
		try {
			if(!nomUniv.isEmpty()) {
				return eServ.deleteUniversiteByNomUniv(nomUniv);
			}else {
				return 0;
			}
			
		} catch (TransactionRequiredException e) {
			// TODO: handle exception
			System.out.println(e);
			return 0;
		}
		
	}
}
