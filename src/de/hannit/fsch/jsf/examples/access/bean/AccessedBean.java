/**
 * 
 */
package de.hannit.fsch.jsf.examples.access.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author hit
 *
 */
@ManagedBean
@RequestScoped
public class AccessedBean 
{

	/**
	 * Eine zweite Bean, auf die über den ELREsolver zugegriffen wird 
	 */
	public AccessedBean() 
	{
		// TODO Auto-generated constructor stub
	}

}
