package nl.rsvier.icaras.core.relatiebeheer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CvGenerator implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cvGeneratorId;
	
	@OneToOne
	//@JoinColumn (nullable = false)
	private Persoon persoon;

}
