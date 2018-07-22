package lhidde.edu.upo.eps.giisi.tfg.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteTasteCAImpl<T,K,V> extends SiteImpl<T,K,V> {
    protected static final String DOMAIN = "www.taste.com.au";

    protected SiteTasteCAImpl() {}
    public SiteTasteCAImpl(String url) {
	super(url);
    }

    @Override
    protected void loadNutritionalData() {	
	Elements elms = super.root.select(".nutrition-collapsible-text-box.collapsible-text-box>ul>li");
	super.values = new HashMap<K,V>(elms.size());
	//TODO: not standarised structure, need a model
	for (Element elm : elms)
	    super.values.put(
		    (K)elm.select(".nutrition-label").text(),
		    (V)elm.select(".nutrition-value").text());
    }

    @Override
    protected void loadIngredients() {
	//TODO: need a model to split content
	Elements elms = super.root.select(".ingredient-description");
	super.ingredients = new ArrayList<T>(elms.size());

	for (Element elm : elms)
	    super.ingredients.add((T)elm.text());

    }
}
