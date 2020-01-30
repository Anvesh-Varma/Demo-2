package com.accenture.lkm.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.accenture.lkm.bean.ResourceBean;
import com.accenture.lkm.service.ResourceService;

@Controller
public class ResourceController {

	@Autowired
	ResourceService resourceService;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, "dateOfJoining", new CustomDateEditor(dateFormat, true));
	}

	
	
	@RequestMapping(value = "/CreateCustomer", method = RequestMethod.GET)
	public ModelAndView LoadForm() {
		return new ModelAndView("CreateCustomer", "customer", new ResourceBean());
	}

	@RequestMapping(value = "/CreateCustomer", method = RequestMethod.POST)
	public ModelAndView  Savecustomer(@ModelAttribute("customer")ResourceBean resourceBean) {
		int id=resourceService.saveResource(resourceBean);
		return new ModelAndView("success", "id", id);
	}



	
	  @ExceptionHandler(value = Throwable.class)
	  public ModelAndView handleAllExceptions(Exception exception) {
		  exception.printStackTrace();
	  return null;
	  
	  
	  }
	 

}
