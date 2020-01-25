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

import com.innovar.iTracker.model.UserStory;
import com.innovar.iTracker.repository.UserStoryRepository;

@RestController
public class UserStoryController {
	
	private UserStoryRepository userStoryRepository;

	@Autowired
	public UserStoryController(UserStoryRepository userStoryRepository) {
		super();
		this.userStoryRepository = userStoryRepository;
	}
	
	@GetMapping("/story/all")
	Iterable<UserStory> all() {
		return userStoryRepository.findAll();
	}

	@GetMapping("/story/{id}")
	UserStory userById(@PathVariable Long id) {
		return userStoryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/story/save")
	UserStory save(@RequestBody UserStory story) {
		return userStoryRepository.save(story);
	}
	
	@PutMapping("/story/update")
	UserStory update(@RequestBody UserStory story) {
		return userStoryRepository.save(story);
	}
	
	
	

}
