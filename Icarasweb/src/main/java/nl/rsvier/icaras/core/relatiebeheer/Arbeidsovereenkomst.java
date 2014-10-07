package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import nl.rsvier.icaras.core.Bedrijf;

@Entity
public class Arbeidsovereenkomst {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int arbeidsovereenkomstId;
	
	@OneToOne
	@JoinColumn (nullable = false)
	private Bedrijf referentieBedrijf;
	
	@OneToOne
	@JoinColumn (nullable = false)
	private Persoon referentiePersoon;
	
	@OneToOne
	@JoinColumn (nullable = false)
	private Aanbieding referentieAanbieding;
	

public Bedrijf getReferentieBedrijf() {
		return referentieBedrijf;}
	
	public void setReferentieBedrijf(Bedrijf referentieBedrijf) {
		this.referentieBedrijf = referentieBedrijf;
	}
	public Persoon getReferentiePersoon() {
		return referentiePersoon;
	}
	public void setReferentiePersoon(Persoon referentiePersoon) {
		this.referentiePersoon = referentiePersoon;
	}
	public Aanbieding getReferentieAanbieding() {
		return referentieAanbieding;
	}
	public void setReferentieAanbieding(Aanbieding referentieAanbieding) {
		this.referentieAanbieding = referentieAanbieding;
	}	
	

}
