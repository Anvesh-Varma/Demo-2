package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.lkm.bean.ResourceBean;
import com.accenture.lkm.entity.ResourceEntity;



@Repository
public class ResourceDAOWrapper {
	
	
	  @Autowired 
	  ResourceDAO resourceDAO;
	 
	  
	  
	  public List<ResourceBean> getResourceDetails() {
		  
		  List<ResourceBean> beans=new ArrayList<ResourceBean>();
		  List<ResourceEntity> resourceEntities= resourceDAO.getResourceDetails();
		  for(ResourceEntity resourceEntity:resourceEntities) {
			 ResourceBean bean=new ResourceBean();
			  BeanUtils.copyProperties(resourceEntity, bean);
			  beans.add(bean);
			  
		  }
		  return beans;
		  
	  }
	 
	  
	public List<String>getResourceDetailsBySkill()
	{
		return resourceDAO.getResourceDetailsBySkill();
	}
	  
	
	  
	  public int saveResource(ResourceBean bean) {
		  
		 ResourceEntity id;
		 ResourceEntity resourceEntity=new ResourceEntity();
		  BeanUtils.copyProperties(bean, resourceEntity);
		  id=resourceDAO.save(resourceEntity);
		  return id.getResourceId();
		  
		  
	  }

}
