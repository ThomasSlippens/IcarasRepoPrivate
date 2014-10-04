package nl.rsvier.icaras.core.relatiebeheer;

public class Arbeidsovereenkomst {
	
	private Bedrijf referentieBedrijf;
	private Persoon referentiePersoon;
	private Aanbieding referentieAanbieding;
	
	
	
	
	public Bedrijf getReferentieBedrijf() {
		return referentieBedrijf;
	}
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
