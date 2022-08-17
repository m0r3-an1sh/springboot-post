package com.GroupProject.SpringRestProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<movie, Integer> {
}
