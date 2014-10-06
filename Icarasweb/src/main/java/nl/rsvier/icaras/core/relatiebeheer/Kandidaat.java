package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Kandidaat implements IPersoonsRol {

@ElementCollection	
private Set <Aanbieding> aanbiedingen;
@Embedded
private CvGenerator gegenereerdCv;



public Set<Aanbieding> getAanbiedingen() {
	return aanbiedingen;
}

public void setAanbiedingen(Set<Aanbieding> aanbiedingen) {
	this.aanbiedingen = aanbiedingen;
}	
	
}
