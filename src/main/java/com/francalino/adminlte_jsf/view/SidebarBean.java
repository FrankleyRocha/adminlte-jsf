package com.francalino.adminlte_jsf.view;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletRequest;

@Named
@RequestScoped
public class SidebarBean implements Serializable {
	
	private static final long serialVersionUID = -6866412235071874839L;

	public Boolean hasActivated(String pagina) {
		
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
										
		return req.getRequestURI().lastIndexOf(pagina) != -1;
				
	}

}
