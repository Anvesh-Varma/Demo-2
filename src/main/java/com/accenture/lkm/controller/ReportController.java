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
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.bean.ResourceBean;
import com.accenture.lkm.service.ResourceService;

@Controller
public class ReportController {
	
	@Autowired
	ResourceService resourceService;

	
	

	@RequestMapping(value = "/ResourceReport", method = RequestMethod.GET)
	public ModelAndView getResourceDetails(@ModelAttribute("resourceBean")ResourceBean resourceBean){
		List<ResourceBean> beans=resourceService.getResourceDetails();
		return new ModelAndView("ResourceReport", "resourceBean", beans);
	}
	

	  @ExceptionHandler(value = Throwable.class) public ModelAndView
	  handleAllExceptions(Exception exception) { exception.printStackTrace();
	  return null;
	  
	  
	  }


}

