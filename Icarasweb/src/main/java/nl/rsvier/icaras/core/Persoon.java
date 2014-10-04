package nl.rsvier.icaras.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@SuppressWarnings("serial") //Om melding van afwezigheid serialVersionUID field te negeren
@Entity //Marker voor Hibernate dat dit een klasse voor de database is.
public class Persoon implements Serializable {

	private int persoonID;
	private String voornaam;
	private Adres adres;
	
	public Persoon() {
	}
	
	@Id //primary key
	@GeneratedValue //waarde wordt aangemaakt vanuit de database
	public int getPersoonID() {
		return persoonID;
	}

	public void setPersoonID(int persoonID) {
		this.persoonID = persoonID;
	}
	@Column(length=50) //voorbeeld van hoe je eigenschap van kolom in db kunt aanpassen
	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	@Embedded //geen zelfstandige entiteit, maar opgenomen in een entiteit.
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}