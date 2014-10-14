
package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * @author: Mark
 */

@MappedSuperclass
public abstract class Rol {
	
	/*
	 * Attributen
	 */
	
	@Id
	@GeneratedValue
	protected int id;
	@Column()
	private String omschrijving;
	@Column()
	private boolean gearchiveerd = false;
	
	/*
	 * Constructoren
	 */
	
	public Rol() {
		
	}
	
	/*
	 * Getters
	 */
	
	
	public int getId() {
		return id;
	}
	
	
	public String getOmschrijving() {
		return this.omschrijving;
	}
	
	public boolean isGearchiveerd() {
		return this.gearchiveerd;
	}
	
	/*
	 * Setters
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setOmschrijving(String str) {
		this.omschrijving = str;
	}
	
	public void setGearchiveerd(boolean b) {
		this.gearchiveerd = b;
	}
	
}
