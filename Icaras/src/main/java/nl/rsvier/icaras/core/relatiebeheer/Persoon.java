
package nl.rsvier.icaras.core.relatiebeheer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * @author: Mark
 */

@Entity
@PrimaryKeyJoinColumn(name = "relatieId")
public class Persoon extends Relatie implements IEntity {
	
	// Serializable interface requires us to declare a serial
	private static final long serialVersionUID = 1L;
	
	/*
	 * Attributen
	 */
	
	// @Column(nullable = false)
	private String voornaam;
	// @Column(nullable = false)
	private String achternaam;
	// @Column(nullable = false)
	private String tussenvoegsels;
	
	@Temporal(TemporalType.DATE)
	private Calendar geboortedatum;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = PersoonsRol.class)
	@JoinColumn(name = "FK_relatieId")
	private List<PersoonsRol> rollen;
	
	/*
	 * Constructoren
	 */
	
	public Persoon() {
		rollen = new ArrayList<PersoonsRol>();
		this.tussenvoegsels = "";
	}
	
	/*
	 * Getters
	 */
	
	public String getVoornaam() {
		return this.voornaam;
	}
	
	public String getTussenvoegsels() {
		return this.tussenvoegsels;
	}
	
	public String getAchternaam() {
		return this.achternaam;
	}
	
	public List<PersoonsRol> getRollen() {
		return this.rollen;
	}
	
	public Calendar getGeboorteDatum() {
		return this.geboortedatum;
	}
	
	public String getTussenVoegsels() {
		return this.tussenvoegsels;
	}
	
	/*
	 * Setters
	 */
	
	public void setVoornaam(String naam) {
		this.voornaam = naam;
	}
	
	public void setGeboorteDatum(Calendar geboortedatum1) {
		this.geboortedatum = geboortedatum1;
	}
	
	public void setAchternaam(String string) {
		this.achternaam = string;
	}
	
	public void setTussenVoegsels(String string) {
		this.tussenvoegsels = string;
	}
	
	public void setPersoonsRollen(List<PersoonsRol> rollen) {
		this.rollen = rollen;
	}
	
	public void addPersoonsRol(PersoonsRol rol) {
		this.rollen.add(rol);
	}
	
	public void removePersoonsRol(PersoonsRol rol) {
		this.rollen.remove(rol);
	}
	
	public boolean hasRol(PersoonsRol rol) {
		for (int i = 0; i < this.rollen.size(); i++) {
			PersoonsRol tmp = this.rollen.get(i);
			if (tmp.equals(rol)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persoon) {
			Persoon p = (Persoon) obj;
			
			//System.out.println(this.getRollen().equals(p.getRollen()));
			if (this.getVoornaam().equals(p.getVoornaam())
					&& this.getTussenVoegsels().equals(p.getTussenvoegsels())
					&& this.getAchternaam().equals(p.getAchternaam())
					&& this.getGeboorteDatum().equals(p.getGeboorteDatum())
					) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.getVoornaam() + " " + this.getTussenVoegsels() + " " + this.getAchternaam();
	}
	
}
