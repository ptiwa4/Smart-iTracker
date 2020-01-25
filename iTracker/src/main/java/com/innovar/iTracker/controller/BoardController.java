/**
 * 
 */
package com.innovar.iTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.innovar.iTracker.model.Board;
import com.innovar.iTracker.repository.BoardRepository;

/**
 * @author prashant.tiwari
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BoardController {
	private BoardRepository boardRepository;

	@Autowired
	public BoardController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@GetMapping("/board/all")
	Iterable<Board> all() {
		return boardRepository.findAll();
	}

	@GetMapping("/board/{id}")
	Board userById(@PathVariable Long id) {
		return boardRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/board/save")
	Board save(@RequestBody Board board) {
		return boardRepository.save(board);
	}
	
	@PutMapping("/board/update")
	Board update(@RequestBody Board board) {
		return boardRepository.save(board);
	}

}
