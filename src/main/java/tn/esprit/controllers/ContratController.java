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

import tn.esprit.persistance.entities.Contrat;
import tn.esprit.service.interfaces.ContratService;

@RestController
@RequestMapping("/ControleurContrat")
public class ContratController {

	@Autowired
	ContratService CServ;
	
	@GetMapping("/displayContrat")
	public Contrat displayContrat(int id) {
		return CServ.retrieveContrat(id);
	}
	
	@GetMapping("/displayContrats")
	public List<Contrat> displayAllContrats(){
		return CServ.retrieveAllContrats();
	}
	
	@PostMapping("/addContrat")
	public Contrat addContrat( @RequestBody Contrat e) {
		return CServ.addContrat(e);
	}
	
	@PutMapping("/updateContrat")
	public Contrat updateContrat(@RequestBody Contrat e) {
		return CServ.updateContrat(e);
	}
	
	@DeleteMapping("/deleteContrat")
	public void deleteContrat(int id) {
		CServ.removeContrat(id);
	}
	
	@GetMapping("getContratsBySpecialite/{spec}")
	public List<Contrat> retrieveContratBySpecialite(@PathVariable String spec){
		return CServ.retrieveContratBySpecialite(spec);
	}
	
	@GetMapping("getCOntratsByMontant/{montant}")
	public List<Contrat> retrieveContratByMontantContrat(@PathVariable Integer montant){
		return CServ.retrieveContratByMontantContrat(montant);
	}
}