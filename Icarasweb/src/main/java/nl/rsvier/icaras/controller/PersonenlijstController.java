package nl.rsvier.icaras.controller;

import nl.rsvier.icaras.core.Adres;
import nl.rsvier.icaras.core.Persoon;
import nl.rsvier.icaras.dao.IPersoonDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller voor personenlijst- en voegtoeschermen
 * Deze schermen worden gevormd door de jsp bestanden in webapp/WEB-INF/jsp
 * 
 */
@Controller //Marker voor Spring dat dit een controllerklasse is
public class PersonenlijstController {

	private IPersoonDao persoonDao; //zorgt voor schrijven en lezen van Personen naar de database 

	@Autowired //Zorgt dat de Spring ApplicationContext deze dependency injecteert
	public void setPersoonDao(IPersoonDao persoonDao) {
		this.persoonDao = persoonDao;
	}

	/**
	 * Returns a list of Persoon database objects in Model
	 * 
	 * @see nl.rsvier.icaras.core.Persoon
	 */
	@RequestMapping(value = "/personenlijst") //verwijst naar URI die deze methode aanspreekt
	public String personenlijst(Model model) {
		model.addAttribute("personen", persoonDao.getPersonen());
		return "personenlijst";
	}

	@RequestMapping(value = "/voegtoe", method = RequestMethod.GET)
	public String voegToeForm(Model model) {
		Persoon persoon = new Persoon();
		persoon.setAdres(new Adres());
		model.addAttribute("persoon", persoon);
		return "voegtoe";
	}

	@RequestMapping(value = "/voegtoe", method = RequestMethod.POST) //soort methode vd request
	public String voegToeSubmit(@ModelAttribute Persoon persoon, Model model) {
		// is deze regel nodig? model.addAttribute("persoon", persoon);
		persoonDao.savePersoon(persoon);
		return "redirect:/personenlijst";
	}
}
