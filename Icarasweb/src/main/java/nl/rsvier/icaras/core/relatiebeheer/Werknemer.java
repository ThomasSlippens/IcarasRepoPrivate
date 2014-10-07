package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Werknemer extends AbstractPersoonsRol implements IPersoonsRol{
	/*
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int werknemerId;
	*/
	@OneToMany
	@JoinColumn (nullable = false)
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
