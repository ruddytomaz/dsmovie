package com.ruddytomaz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruddytomaz.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
