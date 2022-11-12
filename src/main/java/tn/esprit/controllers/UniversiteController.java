package tn.esprit.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.Universite;
import tn.esprit.service.interfaces.UniversiteService;

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
}
