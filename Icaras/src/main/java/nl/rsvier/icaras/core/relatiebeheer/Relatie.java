package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Relatie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int relatieId;
	
	public int getId() {
		return this.relatieId;
	}
	
	public void setId(int id) {
		this.relatieId = id;
	}

}
