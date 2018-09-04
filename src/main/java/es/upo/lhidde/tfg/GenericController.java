package es.upo.lhidde.tfg;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class GenericController extends ActionSupport implements ServletRequestAware {

	/**
	 * controlador generico que define las partes comunes de todos los controladores
	 */
	
	private static final long serialVersionUID = 1L;

	protected HttpServletRequest request;
	
	public abstract String execute();

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}
 

}
