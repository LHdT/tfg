package es.upo.lhidde.tfg;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class GenericController extends ActionSupport implements ServletRequestAware {

	/**
	 * Serial id para la inyeccion de dependencias que permite a spring inyectar los controladores struts
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
 

}
