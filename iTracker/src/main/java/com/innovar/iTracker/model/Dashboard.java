/**
 * 
 */
package com.innovar.iTracker.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author prashant.tiwari
 *
 */
@Entity
public class Dashboard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dashboard_id")
	private Long id;

	private String name;

	private String createdBy;

	@Enumerated(EnumType.STRING)
	private DashboardStatus status;

	@OneToMany(mappedBy = "dashboard")
	private List<Project> projects = new ArrayList<>();

	/**
	 * 
	 */
	public Dashboard() {
		// TODO Auto-generated constructor stub
	}

	enum DashboardStatus {
		CREATED, ACTIVE, INACTIVE, DELETED;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public DashboardStatus getStatus() {
		return status;
	}

	public void setStatus(DashboardStatus status) {
		this.status = status;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
