package tn.esprit.persistance.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "detailEquipe")
public class DetailEquipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDetailEquipe")
	private Integer idDetailEquipe;
	private Integer salle;
	private String thematique;
}
