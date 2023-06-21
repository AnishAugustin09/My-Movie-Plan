package com.movieplan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieplan.Entity.Theater;
import com.movieplan.Entity.TheaterMovie;

public interface TheaterRepository extends JpaRepository<Theater, Integer>{
		
}
