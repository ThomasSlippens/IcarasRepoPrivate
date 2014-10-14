
package nl.rsvier.icaras.core.relatiebeheer;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "persoonsRolId")
public class Kandidaat extends PersoonsRol implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Set<Aanbieding> aanbiedingen;
	
	@OneToOne
	// @JoinColumn (nullable = false)
	private CvGenerator gegenereerdCv;
	
	public Set<Aanbieding> getAanbiedingen() {
		return aanbiedingen;
	}
	
	public void setAanbiedingen(Set<Aanbieding> aanbiedingen) {
		this.aanbiedingen = aanbiedingen;
	}
	
}
