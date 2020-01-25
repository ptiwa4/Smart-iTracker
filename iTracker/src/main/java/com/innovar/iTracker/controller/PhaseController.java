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

import com.innovar.iTracker.model.Phase;
import com.innovar.iTracker.repository.PhaseRepository;

@RestController
public class PhaseController {
	private PhaseRepository phaseRepository;

	@Autowired
	public PhaseController(PhaseRepository phaseRepository) {
		this.phaseRepository = phaseRepository;
	}

	@GetMapping("/phase/all")
	Iterable<Phase> all() {
		return phaseRepository.findAll();
	}

	@GetMapping("/phase/{id}")
	Phase userById(@PathVariable Long id) {
		return phaseRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/phase/save")
	Phase save(@RequestBody Phase phase) {
		return phaseRepository.save(phase);
	}

	@PutMapping("/phase/update")
	Phase update(@RequestBody Phase phase) {
		return phaseRepository.save(phase);
	}

}
