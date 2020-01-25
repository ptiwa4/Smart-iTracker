/**
 * 
 */
package com.innovar.iTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.innovar.iTracker.model.Project;
import com.innovar.iTracker.repository.ProjectRepository;

/**
 * @author prashant.tiwari
 *
 */
@RestController
public class ProjectController {

	private ProjectRepository projectRepository;

	@Autowired
	public ProjectController(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	@GetMapping("/project/all")
	Iterable<Project> all() {
		return projectRepository.findAll();
	}

	@GetMapping("/project/{id}")
	Project userById(@PathVariable Long id) {
		return projectRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/project/save")
	Project save(@RequestBody Project project) {
		return projectRepository.save(project);
	}
	
	@PutMapping("/project/update")
	Project update(@RequestBody Project project) {
		return projectRepository.save(project);
	}

}
