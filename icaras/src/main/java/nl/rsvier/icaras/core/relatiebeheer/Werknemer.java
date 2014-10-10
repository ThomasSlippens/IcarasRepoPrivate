package nl.rsvier.icaras.core.relatiebeheer;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn (name="persoonsRolId")
public class Werknemer extends PersoonsRol implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	//@JoinColumn (nullable = false)
	private Set <Arbeidsovereenkomst> Arbeidsovereenkomsten;

	public Set<Arbeidsovereenkomst> getArbeidsovereenkomsten() {
		return Arbeidsovereenkomsten;
	}
	
	
	public void setArbeidsovereenkomsten(
			Set<Arbeidsovereenkomst> arbeidsovereenkomsten) {
		Arbeidsovereenkomsten = arbeidsovereenkomsten;
	}

	
	
	

}
