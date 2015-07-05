/**
 * 
 */
package com.kcpradeep.common.form;

import org.apache.struts.action.ActionForm;

/**
 * @author Home
 *
 */
public class HelloWorldForm extends ActionForm {

	private String message;

	/**
	 * 
	 */
	public HelloWorldForm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
