package com.accenture.lkm.bean;

import java.util.Date;

public class ResourceBean {
	private int resourceId;
	private String resourceName;
	private String resourceSkill;
	private Date dateOfJoining;
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceSkill() {
		return resourceSkill;
	}
	public void setResourceSkill(String resourceSkill) {
		this.resourceSkill = resourceSkill;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
}