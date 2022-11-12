package tn.esprit.persistance.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name="etudiant")
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEtudiant")
	private Integer idEtudiant;

	private String prenomE;
	private String nomE;
	@Enumerated(EnumType.STRING)
	private Option op;
	@OneToMany(mappedBy = "etudiant")
	private Set<Contrat> contrats;

	@ManyToMany(mappedBy = "etudiants")
	private Set<Equipe> equipes;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="departement_id",referencedColumnName = "idDepart" )
	private Departement departement;
}
