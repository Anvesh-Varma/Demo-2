package com.accenture.lkm.dao;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.accenture.lkm.entity.ResourceEntity;

@Repository
public interface ResourceDAO extends CrudRepository<ResourceEntity, Integer>{
	
	@Query("select c from ResourceEntity c ")
	public List<ResourceEntity> getResourceDetails();
	
	
	@Query("select c.resourceSkill from ResourceEntity c")
	public List<String>getResourceDetailsBySkill();
	
	
	

}
