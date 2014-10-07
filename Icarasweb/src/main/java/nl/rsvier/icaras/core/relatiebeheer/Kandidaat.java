package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kandidaat extends AbstractPersoonsRol implements IPersoonsRol {
	/*
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int kandidaatId;
*/
@OneToMany
private Set <Aanbieding> aanbiedingen;

@OneToOne
@JoinColumn (nullable = false)
private CvGenerator gegenereerdCv;



public Set<Aanbieding> getAanbiedingen() {
	return aanbiedingen;
}

public void setAanbiedingen(Set<Aanbieding> aanbiedingen) {
	this.aanbiedingen = aanbiedingen;
}	
	
}
