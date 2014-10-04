package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Date;
import java.util.Set;

public class Persoon extends Relatie {

//attributen
	
	private String voornaam;
	private String achternaam;
	private String tussenvoegsels;
	private Set <IPersoonsRol>persoonsRollen;
	private Date geboortedatum;
	
	
	
	
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getTussenvoegsels() {
		return tussenvoegsels;
	}
	public void setTussenvoegsels(String tussenvoegsels) {
		this.tussenvoegsels = tussenvoegsels;
	}
	public Set<IPersoonsRol> getPersoonsRollen() {
		return persoonsRollen;
	}
	public void setPersoonsRollen(Set<IPersoonsRol> persoonsRollen) {
		this.persoonsRollen = persoonsRollen;
	}
	public Date getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
	
	
	
	
	
	

	
	
}
