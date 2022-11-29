package tn.esprit.service.interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.persistance.entities.Universite;

public interface UniversiteService {
	List<Universite> retrieveAllUniversites();
	Universite addUniversite(Universite e);
	Universite updateUniversite(Universite e);
	Universite retrieveUniversite(Integer idUniversite);
	void removeUniversite(Integer idUniversite);
	int deleteUniversiteByNomUniv(String nomUniv);
}
