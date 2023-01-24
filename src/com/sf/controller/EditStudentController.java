package com.sf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sf.command.StudentCommand;

public class EditStudentController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mav = null;
		StudentCommand studCmd = null;

		studCmd = (StudentCommand) command;
		mav = new ModelAndView();
		mav.addObject("id", studCmd.getId());
		mav.setViewName("success");
		return mav;

	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		StudentCommand command = null;
		
		command = new StudentCommand();
		int id = Integer.parseInt(request.getParameter("sid"));
		command.setId(id);
		command.setName("Rama");
		return command;
	}

}
