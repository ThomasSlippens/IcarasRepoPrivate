package nl.rsvier.icaras.core.relatiebeheer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Aanbieding implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aanbiedingId;
	
	@OneToOne
	//@JoinColumn (nullable = false)
	private Vacature vacature;

	@OneToOne
	//@JoinColumn (nullable = false)
	private Persoon referentiePersoon;

	@OneToOne
	//@JoinColumn (nullable = false)
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