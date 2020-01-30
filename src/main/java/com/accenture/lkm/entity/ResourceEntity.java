package com.accenture.lkm.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ResourceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int resourceId;
	private String resourceName;
	private String resourceSkill;
	@Temporal(TemporalType.DATE)
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
	@Override
	public String toString() {
		return "ResourceEntity [resourceId=" + resourceId + ", resourceName=" + resourceName + ", resourceSkill="
				+ resourceSkill + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	

}
