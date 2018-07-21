package es.upo.lhidde.tfg;

import com.opensymphony.xwork2.ActionSupport;

import es.upo.lhidde.tfg.services.MainMenuService;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class LandingController extends ActionSupport implements ServletRequestAware {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	HttpServletRequest request;
    
    @Autowired
    MainMenuService mainMenuService;

    @Override
    public String execute() throws Exception {
    	setUpRequestParams();
        return "index";
    }

    public void setUpRequestParams(){
        request.setAttribute("nombre", "Luis<br/>Hidalgo");
        
        
        request.setAttribute("menuItems", mainMenuService.getMenuItems());
    }

    @Override
    public void setServletRequest(HttpServletRequest  httpServletRequest) {
        request = httpServletRequest;
    }
}
