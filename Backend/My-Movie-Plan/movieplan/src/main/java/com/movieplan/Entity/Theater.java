package com.movieplan.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Theater {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	@Column
	private String TheaterName;
	@Column
	private String TheaterAddress;
	@Column
	private String TheaterCity;
	@Column
	private String TheaterState;
	
	
	
	  @ManyToMany(fetch=FetchType.LAZY,cascade = { CascadeType.ALL,
	  CascadeType.MERGE })
	  @JoinTable(name="theater_movie",joinColumns= {
		  @JoinColumn(name="theater_id", referencedColumnName = "tid")
		  },
	  
		  inverseJoinColumns= {
				  @JoinColumn(name="movie_id", referencedColumnName="MovieId")
	  } )
	  private List<Movie> movies = new ArrayList<>() ;
		
	  
	 
	
	
	
		/*
		 * @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL, orphanRemoval =
		 * true) private List<Screen> screens = new ArrayList<>();
		 */
	 
	
	/*
	 * @OneToOne(cascade=CascadeType.ALL) private Movie movie;
	 * 
	 * @OneToOne(cascade=CascadeType.ALL) private Screen screen;
	 */
	
	 
	public int getId() {
		return tid;
	}
	public void setId(int id) {
		this.tid = id;
	}
	public String getTheaterName() {
		return TheaterName;
	}
	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}
	public String getTheaterAddress() {
		return TheaterAddress;
	}
	public void setTheaterAddress(String theaterAddress) {
		TheaterAddress = theaterAddress;
	}
	public String getTheaterCity() {
		return TheaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		TheaterCity = theaterCity;
	}
	public String getTheaterState() {
		return TheaterState;
	}
	public void setTheaterState(String theaterState) {
		TheaterState = theaterState;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
	
	
	
	
}
