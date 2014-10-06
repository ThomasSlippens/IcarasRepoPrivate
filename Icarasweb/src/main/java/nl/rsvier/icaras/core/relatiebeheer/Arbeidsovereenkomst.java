package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import nl.rsvier.icaras.core.Bedrijf;

@Embeddable
public class Arbeidsovereenkomst {
	
	@Embedded
	private Bedrijf referentieBedrijf;
	@Embedded
	private Persoon referentiePersoon;
	@Embedded
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
