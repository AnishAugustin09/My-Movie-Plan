package com.movieplan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movieplan.Entity.Booking;
import com.movieplan.Entity.Movie;
import com.movieplan.Entity.Theater;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	
	
	
	
}
