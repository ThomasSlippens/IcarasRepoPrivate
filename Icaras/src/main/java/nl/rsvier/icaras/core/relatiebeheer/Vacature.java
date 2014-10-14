package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacature {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int persoonId;

}
