package com.GroupProject.SpringRestProject;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class movieService {
	@Autowired
	private movieRepository repo;
	
	public List<movie> listAll() {
        return repo.findAll();
    }
	
	public void save(movie movies) {
		repo.save(movies);
	}
	

}
