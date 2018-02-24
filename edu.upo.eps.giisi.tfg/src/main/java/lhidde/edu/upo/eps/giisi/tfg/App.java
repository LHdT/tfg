package lhidde.edu.upo.eps.giisi.tfg;

import lhidde.edu.upo.eps.giisi.tfg.model.Site;
import lhidde.edu.upo.eps.giisi.tfg.model.impl.SiteTasteCAImpl;
import lhidde.edu.upo.eps.giisi.tfg.model.impl.SiteWeighCUImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	Site site = new SiteWeighCUImpl(
		"https://www.weightlossresources.co.uk/recipes/calorie-counted/sandwiches-wraps-etc-/tomato-onion-toasts-48.htm");

	System.out.println(site);
    }
}
