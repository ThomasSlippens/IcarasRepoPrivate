package nl.rsvier.icaras.core;

import javax.persistence.Embeddable;

@Embeddable //hoort bij @Embedded in Persoon
public class Adres {
	

	private String postcode; 
	private String huisnummer; // inclusief evt toevoeging
	private String straat;
	private String plaatsnaam;
	
	public Adres() {
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getPlaatsnaam() {
		return plaatsnaam;
	}

	public void setPlaatsnaam(String plaatsnaam) {
		this.plaatsnaam = plaatsnaam;
	}


}
