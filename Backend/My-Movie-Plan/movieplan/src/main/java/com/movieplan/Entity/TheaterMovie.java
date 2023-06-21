package com.movieplan.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="theater_movie")
public class TheaterMovie {

	
	@EmbeddedId
	private TheaterMovieId id;
	
	@ManyToOne
	@MapsId("tid")
	@JoinColumn(name="theater_id")
	private Theater theater;
	
	@ManyToOne
	@MapsId("movieId")
	@JoinColumn(name="movie_id")
	private Movie movie;

	

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	
	
	
	
}
