package nl.rsvier.icaras.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Relatie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int relatieId;

}
