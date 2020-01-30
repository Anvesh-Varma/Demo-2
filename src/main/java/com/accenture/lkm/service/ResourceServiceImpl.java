package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.bean.ResourceBean;
import com.accenture.lkm.dao.ResourceDAO;
import com.accenture.lkm.dao.ResourceDAOWrapper;



@Service
public class ResourceServiceImpl implements ResourceService {
	
	 @Autowired
	ResourceDAOWrapper resourceDAOWrapper;


	@Override
	public List<ResourceBean> getResourceDetails() {
		
		return resourceDAOWrapper.getResourceDetails();
	}

	@Override
	public int saveResource(ResourceBean resourceBean) {
		
		return resourceDAOWrapper.saveResource(resourceBean);
	}

	@Override
	public List<String> getResourceDetailsBySkill() {
		// TODO Auto-generated method stub
		return resourceDAOWrapper.getResourceDetailsBySkill();
	}
}
	
	