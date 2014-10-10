package nl.rsvier.icaras.core.relatiebeheer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@PrimaryKeyJoinColumn(name="relatieId")
public class Persoon extends Relatie implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Column(nullable = false)
	private String voornaam;
	
	//@Column(nullable = false)
	private String achternaam;
	
	//@Column(nullable = false)
	private String tussenvoegsels;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = PersoonsRol.class, cascade = CascadeType.ALL )
	private List <PersoonsRol>persoonsRollen;
	
	//@Column(nullable = false)
	@Temporal (TemporalType.DATE)
	private Date geboortedatum;
	
	
	@PrePersist
	public void prePersist() {
	    if(tussenvoegsels == null) //We set default value in case if the value is not set yet.
	    	tussenvoegsels = "";
	}
	public String getTussenVoegsels() {
	    return tussenvoegsels;
	}
	public void setTussenVoegsels(String tussenvoegsels) {
	    this.tussenvoegsels= tussenvoegsels;
	}
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
	public List<PersoonsRol> getPersoonsRollen() {
		return persoonsRollen;
	}
	public void setPersoonsRollen(List<PersoonsRol> persoonsRollen) {
		this.persoonsRollen = persoonsRollen;
	}
	public Date getGeboortedatum() {
		return geboortedatum;
	}
	public void setGeboortedatum(Date geboortedatum1) {
		this.geboortedatum = geboortedatum1;
	}
	
	
	
	
	
	
	

	
	
}