package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

public class Kandidaat implements IPersoonsRol {

private Set <Aanbieding> aanbiedingen;




public Set<Aanbieding> getAanbiedingen() {
	return aanbiedingen;
}

public void setAanbiedingen(Set<Aanbieding> aanbiedingen) {
	this.aanbiedingen = aanbiedingen;
}	
	
}
