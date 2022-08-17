package com.GroupProject.SpringRestProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movieController {
	@Autowired
	private movieService service;

	@GetMapping("/movies")
	public List<movie> list() {
		return service.listAll();
	}

	@PostMapping("/add-movies")
	public void add(@RequestBody movie movies) {
		service.save(movies);
	}

	@PostMapping("/search-genre")
	public List<movie> search(@RequestBody movie movies) {
		return service.listgenre(movies);
	}
	
	@PostMapping("/search-actor")
	public List<movie> searchactor(@RequestBody movie movies) {
		return service.listactor(movies);

	}
	

}
