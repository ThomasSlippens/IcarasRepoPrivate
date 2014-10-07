package nl.rsvier.icaras.core.relatiebeheer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CvGenerator {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cvGeneratorId;
	
	@OneToOne
	@JoinColumn (nullable = false)
	private Persoon persoon;

}
