package es.upo.lhidde.tfg;

import com.opensymphony.xwork2.ActionSupport;

public class HomeController extends ActionSupport {

    /**
	 * controlador de pagina de bienbenida
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String execute() throws Exception {
        return "home";
    }
}
