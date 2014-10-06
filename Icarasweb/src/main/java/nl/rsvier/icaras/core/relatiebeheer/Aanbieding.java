package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import nl.rsvier.icaras.core.Bedrijf;
import nl.rsvier.icaras.core.Vacature;


@Embeddable
public class Aanbieding {

@Embedded	
private Vacature vacature;

@Embedded
private Persoon referentiePersoon;

@Embedded
private Bedrijf referentieBedrijf;




public Vacature getVacature() {
	return vacature;
}
public void setVacature(Vacature vacature) {
	this.vacature = vacature;
}
public Persoon getReferentiePersoon() {
	return referentiePersoon;
}
public void setReferentiePersoon(Persoon referentiePersoon) {
	this.referentiePersoon = referentiePersoon;
}
public Bedrijf getReferentieBedrijf() {
	return referentieBedrijf;
}
public void setReferentieBedrijf(Bedrijf referentieBedrijf) {
	this.referentieBedrijf = referentieBedrijf;
}

	
}