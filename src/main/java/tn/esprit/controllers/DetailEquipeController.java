package tn.esprit.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.DetailEquipe;
import tn.esprit.service.interfaces.DetailEquipeService;

@RestController
@RequestMapping("/ControleurDetailEquipe")
public class DetailEquipeController {
	@Autowired
	DetailEquipeService eServ;
	
	@GetMapping("/displayDetailEquipe")
	public DetailEquipe displayDetailEquipe(int id) {
		return eServ.retrieveDetailEquipe(id);
	}
	
	@GetMapping("/displayDetailEquipes")
	public List<DetailEquipe> displayAllDetailEquipes(){
		return eServ.retrieveAllDetailEquipes();
	}
	
	@PostMapping("/addDetailEquipe")
	public DetailEquipe addDetailEquipe( @RequestBody DetailEquipe e) {
		return eServ.addDetailEquipe(e);
	}
	
	@PutMapping("/updateDetailEquipe")
	public DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe e) {
		return eServ.updateDetailEquipe(e);
	}
	
	@DeleteMapping("/deleteDetailEquipe")
	public void deleteDetailEquipe(int id) {
		eServ.removeDetailEquipe(id);
	}
	
	@GetMapping("getDetailEquipeById/{idDetailEquipe}")
	public List<DetailEquipe> retrieveContratById(@PathVariable Integer idDetailEquipe) {
		return eServ.retrieveContratById(idDetailEquipe);
	}
	@GetMapping("getDetailEquipeBySalle/{salle}")
	public List<DetailEquipe> retrieveContratBySalle(@PathVariable Integer salle){
		return eServ.retrieveContratBySalle(salle);
	}
	
	@GetMapping("getDetailEquipeByThematique/{thematique}")
	List<DetailEquipe> retrieveContratByThematique(@PathVariable String thematique){
		return eServ.retrieveContratByThematique(thematique);
	}
	
}
