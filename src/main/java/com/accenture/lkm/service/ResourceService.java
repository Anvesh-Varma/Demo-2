package com.accenture.lkm.service;


import java.util.List;

import org.springframework.stereotype.Service;


import com.accenture.lkm.bean.ResourceBean;
@Service
public interface ResourceService {
	
	public List<ResourceBean> getResourceDetails();
	public int saveResource(ResourceBean resourceBean)  ;
	public List<String>getResourceDetailsBySkill() ;

}
