package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;


@Embeddable
public class Werknemer implements IPersoonsRol{

	@ElementCollection
	private Set <Arbeidsovereenkomst> Arbeidsovereenkomsten;

	
//methodes
	
	public Set<Arbeidsovereenkomst> getArbeidsovereenkomsten() {
		return Arbeidsovereenkomsten;
	}
	
	
	public void setArbeidsovereenkomsten(
			Set<Arbeidsovereenkomst> arbeidsovereenkomsten) {
		Arbeidsovereenkomsten = arbeidsovereenkomsten;
	}

	
	
	

}
