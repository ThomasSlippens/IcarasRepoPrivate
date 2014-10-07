package nl.rsvier.icaras.core;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bedrijf {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bedrijfId;

}
