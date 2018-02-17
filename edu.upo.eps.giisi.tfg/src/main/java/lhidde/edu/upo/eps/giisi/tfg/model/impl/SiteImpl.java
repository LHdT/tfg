package lhidde.edu.upo.eps.giisi.tfg.model.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import lhidde.edu.upo.eps.giisi.tfg.model.Site;

public abstract class SiteImpl<T> implements Site{
    protected String url;
    protected List<T> ingredients;
    protected Document root;
    protected Map<T, T> values;
    protected static final String DOMAIN = "";
/**
 * Generic constructor
 * @param url
 */
    public SiteImpl(String url) {
	if (!url.contains(DOMAIN))
	    throw new RuntimeException("not compatible URL");
	this.url = url;
	try {

	    snifContent();

	    loadIngredients();

	    loadNutritionalData();

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    

    public List<T> getIngredients() {
    return ingredients;
}



public void setIngredients(List<T> ingredients) {
    this.ingredients = ingredients;
}



public Map<T, T> getValues() {
    return values;
}







public String getDomain() {
    return DOMAIN;
}



    protected void loadNutritionalData() {
	throw new RuntimeException("unimplemented method");
	
    }

    protected void loadIngredients() {
	throw new RuntimeException("unimplemented method");
	
    }

    private void snifContent() throws IOException {
	root = Jsoup.connect(url).get();

    }
    public String toString() {
	
	String str;
	
	str=ingredients+"\n"+values;
	return str;
    }

}
