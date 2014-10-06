package nl.rsvier.icaras.core.relatiebeheer;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import nl.rsvier.icaras.core.Relatie;


@Entity
@PrimaryKeyJoinColumn(name="relatieId")
@SuppressWarnings("serial")
public class Persoon extends Relatie {

//attributen
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int persoonId;
	
	@Column(nullable = false)
	private String voornaam;
	
	@Column(nullable = false)
	private String achternaam;
	
	@Column(nullable = true)
	private String tussenvoegsels;
	
	@ElementCollection
	private Set <IPersoonsRol>persoonsRollen;
	
	@Column(nullable = false)
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