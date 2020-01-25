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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author prashant.tiwari
 *
 */
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private Long id;

	private String name;

	private String createdBy;

	@Enumerated(EnumType.STRING)
	private ProjectStatus status;

	@ManyToOne
	@JoinColumn(name = "dashboard_id")
	@JsonBackReference
	private Dashboard dashboard;

	@OneToMany(mappedBy = "project")
	private List<UserStory> userStories = new ArrayList<>();

	// @OneToMany(mappedBy = "project")
	// private List<Board> boards = new ArrayList<>();

	/**
	 * 
	 */
	public Project() {
		// TODO Auto-generated constructor stub
	}

	enum ProjectStatus {
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

	public ProjectStatus getStatus() {
		return status;
	}

	public void setStatus(ProjectStatus status) {
		this.status = status;
	}

	public Dashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

//	public List<Board> getBoards() {
//		return boards;
//	}
//
//	public void setBoards(List<Board> boards) {
//		this.boards = boards;
//	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

}