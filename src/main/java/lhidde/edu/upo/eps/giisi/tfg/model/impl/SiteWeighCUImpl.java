package lhidde.edu.upo.eps.giisi.tfg.model.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteWeighCUImpl<T,K,V> extends SiteImpl<T,K,V>  {
    protected static final String DOMAIN = "www.weightlossresources.co.uk";
    protected SiteWeighCUImpl() {}
    public SiteWeighCUImpl(String url) {
    	super(url);
    }
    
    @Override
    protected void loadNutritionalData() {
	int i=0;
	Elements elms = super.root.select("div.col.span_2_of_5>table>tbody");
	super.values = new HashMap<K,V>(elms.size());
	//TODO: not standarised structure, need a model
	for (Element elm : elms) {
	    
	    String key=""
		  ,value="";
	    for (Element elmTr: elm.select("tr")) {
			if(i==0)
			    key=elmTr.select("td").text();
			else if (i==1)
			    value=elmTr.select("td").text();
			else
			    throw new IndexOutOfBoundsException();	    
		    super.values.put((K)key, (V)value);
	    }
	}
    }
    
    @Override
    protected void loadIngredients() {
	Elements elms = super.root.select("div.col.span_1_of_3>ul.ingredients>li");
	super.ingredients = new ArrayList<T>(elms.size());
	for (Element elm : elms)
	    super.ingredients.add((T) elm.text());
    }

}
