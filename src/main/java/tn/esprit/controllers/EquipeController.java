package tn.esprit.controllers;
import java.util.List;

import javax.persistence.TransactionRequiredException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistance.entities.Equipe;
import tn.esprit.persistance.entities.Etudiant;
import tn.esprit.persistance.repositories.EtudiantRepository;
import tn.esprit.service.interfaces.DetailEquipeService;
import tn.esprit.service.interfaces.EquipeService;
import tn.esprit.service.interfaces.EtudiantService;


@Transactional
@RestController
@RequestMapping("/ControleurEquipe")
public class EquipeController {
	@Autowired
	EquipeService eServ;
	
	@Autowired
	EtudiantService etudServ;
	
	@Autowired
	DetailEquipeService detServ;
	
	EtudiantRepository etudRep;
	
	@GetMapping("/displayEquipe")
	public Equipe displayEquipe(int id) {
		return eServ.retrieveEquipe(id);
	}
	
	@GetMapping("/displayEquipes")
	public List<Equipe> displayAllEquipes(){
		return eServ.retrieveAllEquipes();
	}
	
	@PostMapping("/addEquipe")
	public Equipe addEquipe( @RequestBody Equipe e) {
		detServ.addDetailEquipe(e.getDetailEquipe());
		return eServ.addEquipe(e);
	}
	
	@PutMapping("/updateEquipe")
	public Equipe updateEquipe(@RequestBody Equipe e) {
		return eServ.updateEquipe(e);
	}
	
	@DeleteMapping("/deleteEquipe")
	public void deleteEquipe(int id) {
		eServ.removeEquipe(id);
	}
	
	@Modifying
	@PutMapping("updateNomEquipeById/{nomEquipe}/{idEquipe}")
	public int updateNomEquipeById(@Param("nomEquipe") String nomEquipe,@Param("idEquipe") Integer idEquipe) {
		
		try {
			eServ.updateNomEquipeById( idEquipe,nomEquipe);
		
			System.out.println(idEquipe);
			return 1;
		} catch (TransactionRequiredException e) {
			System.out.println(e);
			return 0;
			// TODO: handle exception
		}
		
	}
	

}
