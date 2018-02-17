package lhidde.edu.upo.eps.giisi.tfg.model;

import java.util.List;
import java.util.Map;

public interface Site<T> {
    public Map<T, T> getValues();

    public String getDomain();
    
    public List<T> getIngredients();
}
