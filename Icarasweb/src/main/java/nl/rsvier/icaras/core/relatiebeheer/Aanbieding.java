package nl.rsvier.icaras.core.relatiebeheer;

public class Aanbieding {

private Vacature vacature;
private Persoon referentiePersoon;
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
