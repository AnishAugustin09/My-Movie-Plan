package com.movieplan.Entity;

import java.io.Serializable;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class TheaterMovieId implements Serializable{

	@Column(name="theater_id")
	private int TheaterID;
	
	@Column(name="movie_id")
	private int MovieId;

	public int getTheaterID() {
		return TheaterID;
	}

	public void setTheaterID(int theaterID) {
		TheaterID = theaterID;
	}

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	
	
}
