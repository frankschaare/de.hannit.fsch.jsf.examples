/**
 * 
 */
package de.hannit.fsch.jsf.examples.access.bean;

import javax.el.ELResolver;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * @author hit
 *
 */
@ManagedBean
@RequestScoped
public class ViewBean 
{
private String buttonText = "Access";	

	/**
	 * Beispielklasse für den Zugriff auf eine andere Managed Bean 
	 */
	public ViewBean() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public String accessAnotherBean() 
	{
	FacesContext fc = FacesContext.getCurrentInstance();
	ELResolver elResolver = fc.getApplication().getELResolver();

	AccessedBean ab = (AccessedBean) elResolver.getValue(fc.getELContext(), null, "accessedBean");
	String className = ab.getClass().getSimpleName();

    fc.addMessage(null, new FacesMessage("Der Klassenname der abgefragten Bean war: " + className));
    
    return null;
	}

	public String getButtonText() {return buttonText;}	

}
