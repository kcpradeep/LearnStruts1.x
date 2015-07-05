/**
 * 
 */
package com.kcpradeep.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.kcpradeep.common.form.HelloWorldForm;

/**
 * @author Home
 *
 */
public class HelloWorldAction extends Action {

	/**
	 * 
	 */
	public HelloWorldAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello Struts World!!!");
		return mapping.findForward("success");
	}

}
