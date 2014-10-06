package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

import javax.persistence.Embeddable;


@Embeddable
public class Werknemer implements IPersoonsRol{

	
	private Set <Arbeidsovereenkomst> Arbeidsovereenkomsten;

	
	
	
	
	public Set<Arbeidsovereenkomst> getArbeidsovereenkomsten() {
		return Arbeidsovereenkomsten;
	}

	public void setArbeidsovereenkomsten(
			Set<Arbeidsovereenkomst> arbeidsovereenkomsten) {
		Arbeidsovereenkomsten = arbeidsovereenkomsten;
	}

	
	
	

}
