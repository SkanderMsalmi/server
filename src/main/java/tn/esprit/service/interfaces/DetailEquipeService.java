package tn.esprit.service.interfaces;

import java.util.List;



import tn.esprit.persistance.entities.DetailEquipe;

public interface DetailEquipeService {
	List<DetailEquipe> retrieveAllDetailEquipes();
	DetailEquipe addDetailEquipe(DetailEquipe e);
	DetailEquipe updateDetailEquipe(DetailEquipe e);
	DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe);
	void removeDetailEquipe(Integer idDetailEquipe);
	List<DetailEquipe> retrieveContratById( Integer idDetailEquipe);
	List<DetailEquipe> retrieveContratBySalle( Integer salle);
	List<DetailEquipe> retrieveContratByThematique( String thematique);
}
