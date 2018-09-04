package es.upo.lhidde.tfg;


import org.springframework.beans.factory.annotation.Autowired;
import es.upo.lhidde.tfg.services.MainMenuService;


public class LandingController extends GenericController {

    /**
	 * Controlador de recepcion de usuario una vez este ha sido autentificado
	 */
	private static final long serialVersionUID = 1L;

	
    
    @Autowired
    MainMenuService mainMenuService;
    
    @Override
    public String execute() {
    	setUpRequestParams();
        return "index";
    }

    public void setUpRequestParams(){
        request.setAttribute("nombre", "Luis<br/>Hidalgo");
        request.setAttribute("menuItems", mainMenuService.getMenuItems());
    }

   
}
