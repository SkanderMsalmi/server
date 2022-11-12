package tn.esprit.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.*;
import tn.esprit.persistance.repositories.EtudiantRepository;
import tn.esprit.service.interfaces.EquipeService;
import tn.esprit.service.interfaces.EtudiantService;

@RestController
@RequestMapping("/ControleurEtudiant")
public class EtudiantController {
	
	@Autowired
	EtudiantService eServ;
	
	@Autowired
	EquipeService equipServ;
	
	@GetMapping("/displayStudent")
	public Etudiant displayStudent(int id) {
		return eServ.retrieveEtudiant(id);
	}
	
	@GetMapping("/displayStudents")
	public List<Etudiant> displayAllStudents(){
		return eServ.retrieveAllEtudiants();
	}
	
	@PostMapping("/addStudent")
	public Etudiant addStudent( @RequestBody Etudiant e) {
		return eServ.addEtudiant(e);
	}
	
	@PutMapping("/updateStudent")
	public Etudiant updateStudent(@RequestBody Etudiant e) {
		return eServ.updateEtudiant(e);
	}
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(int id) {
		eServ.removeEtudiant(id);
	}
	
	
}
