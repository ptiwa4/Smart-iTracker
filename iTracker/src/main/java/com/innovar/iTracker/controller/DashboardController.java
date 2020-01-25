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

import com.innovar.iTracker.model.Dashboard;
import com.innovar.iTracker.repository.DashboardRepository;

/**
 * @author prashant.tiwari
 *
 */
@RestController
public class DashboardController {

	private DashboardRepository dashboardRepository;

	@Autowired
	public DashboardController(DashboardRepository dashboardRepository) {
		this.dashboardRepository = dashboardRepository;
	}

	@GetMapping("/dashboard/all")
	Iterable<Dashboard> all() {
		return dashboardRepository.findAll();
	}

	@GetMapping("/dashboard/{id}")
	Dashboard userById(@PathVariable Long id) {
		return dashboardRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/dashboard/save")
	Dashboard save(@RequestBody Dashboard dashboard) {
		return dashboardRepository.save(dashboard);
	}

	@PutMapping("/dashboard/update")
	Dashboard update(@RequestBody Dashboard dashboard) {
		return dashboardRepository.save(dashboard);
	}

}
