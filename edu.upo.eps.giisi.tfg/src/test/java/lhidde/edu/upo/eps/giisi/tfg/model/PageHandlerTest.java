package lhidde.edu.upo.eps.giisi.tfg.model;

import org.junit.Test;

import lhidde.edu.upo.eps.giisi.tfg.model.impl.SiteTasteCAImpl;

public class PageHandlerTest {

    @Test
    public void testSite() {
	// Testing specific constructor
	Site site = new SiteTasteCAImpl(
		"http://www.taste.com.au/recipes/seared-kangaroo-raspberry-glaze/8179a9df-2188-4050-adea-2163424650ed?r=recipes/nutritioninformation&c=9fa581e4-1ed8-464a-bb96-60cf237d5b21/Nutrition%20information");

    }

    @Test
    public void testGetters() {
	Site site = new SiteTasteCAImpl(
		"http://www.taste.com.au/recipes/seared-kangaroo-raspberry-glaze/8179a9df-2188-4050-adea-2163424650ed?r=recipes/nutritioninformation&c=9fa581e4-1ed8-464a-bb96-60cf237d5b21/Nutrition%20information");

	System.out.println(site);

    }
}
