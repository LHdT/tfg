package lhidde.edu.upo.eps.giisi.tfg.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteTasteCA<T,K,V> extends SiteImpl{
    protected static final String DOMAIN = "www.taste.com.au";

    public SiteTasteCA(String url) {
	super(url);
	// TODO Auto-generated constructor stub
    }

    @Override
    protected void loadNutritionalData() {
	Elements elms = root.select(".nutrition-collapsible-text-box.collapsible-text-box>ul>li");
	values = new HashMap<String, String>(elms.size());

	for (Element elm : elms)
	    values.put(elm.select(".nutrition-label").text(), elm.select(".nutrition-value").text());

    }

    @Override
    protected void loadIngredients() {
	Elements elms = root.select(".ingredient-description");
	ingredients = new ArrayList<String>(elms.size());

	for (Element elm : elms)
	    ingredients.add(elm.text());

    }
}
