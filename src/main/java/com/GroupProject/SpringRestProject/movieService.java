package com.GroupProject.SpringRestProject;

import java.util.ArrayList;
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

	public List<movie> listgenre(movie movies) {
		List<movie> genrekeyword = repo.findAll();
		List<movie> filteredList = new ArrayList<>();

		for (movie movie1 : genrekeyword) {

			if (movie1.getGenre().toString().equals(movies.getGenre().toString())) {
				filteredList.add(movie1);
				System.out.println(movie1.getGenre());

			}
		}
		return filteredList;

	}

	public List<movie> listactor(movie movies) {
		List<movie> actorkeyword = repo.findAll();
		List<movie> filteredList = new ArrayList<>();

		for (movie movie1 : actorkeyword) {

			if (movie1.getActor().toString().equals(movies.getActor().toString())) {
				filteredList.add(movie1);
				System.out.println(movie1.getActor());

			}
		}
		return filteredList;

	}

}
