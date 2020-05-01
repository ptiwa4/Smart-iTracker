/**
 * 
 */
package com.innovar.iTracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author prashant.tiwari
 *
 */
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_id")
	private Long id;

	private String name;

	private String createdBy;

	@ManyToOne
	@JoinColumn(name = "project_id", nullable = false)
	private Project project;

	@OneToMany(mappedBy = "board")	
	private Set<Phase> phases = new HashSet<>();

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Set<Phase> getPhases() {
		return phases;
	}

	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}

}