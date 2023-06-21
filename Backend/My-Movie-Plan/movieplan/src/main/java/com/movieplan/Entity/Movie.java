package com.movieplan.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.engine.internal.Cascade;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Movie {
	
	@Id
	private int MovieId;
	
	
	@Column
	private String image;
	@Column(nullable=false)
	private String MovieName;
	@Column
	private String MovieCertifiedas;
	@Column
	private String MovieRating;
	@Column
	private String MovieDirector;
	@Column
	private String MovieActorName;
	@Column
	private String MovieProducre;
	@Column
	private String movieCategory;
	@Column
	private String screenNumber;
	@Column
	private String seats;
	@Column
	private String availableSeats;
	
	
	
	/*
	 * @Column private DateTime CreatedAt;
	 * 
	 * @Column private DateTime updatedAt;
	 */
	
	
	
	  public String getScreenNumber() {
		return screenNumber;
	}
	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}
	/*
	 * @ManyToMany(mappedBy = "movies",fetch= FetchType.LAZY,cascade = {
	 * CascadeType.PERSIST, CascadeType.MERGE }) private List<Theater> theaters ;
	 */
	  
	
		/*
		 * @OneToOne(cascade=CascadeType.ALL) private Screen screens;
		 */
	 
	 
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	
	/*
	 * @OneToOne private Theater theater;
	 */
	/*
	 * public DateTime getCreatedAt() { return CreatedAt; } public void
	 * setCreatedAt(DateTime createdAt) { CreatedAt = createdAt; } public DateTime
	 * getUpdatedAt() { return updatedAt; } public void setUpdatedAt(DateTime
	 * updatedAt) { this.updatedAt = updatedAt; }
	 */
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getMovieCertifiedas() {
		return MovieCertifiedas;
	}
	public void setMovieCertifiedas(String movieCertifiedas) {
		MovieCertifiedas = movieCertifiedas;
	}
	public String getMovieRating() {
		return MovieRating;
	}
	public void setMovieRating(String movieRating) {
		MovieRating = movieRating;
	}
	public String getMovieDirector() {
		return MovieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		MovieDirector = movieDirector;
	}
	public String getMovieActorName() {
		return MovieActorName;
	}
	public void setMovieActorName(String movieActorName) {
		MovieActorName = movieActorName;
	}
	public String getMovieProducre() {
		return MovieProducre;
	}
	public void setMovieProducre(String movieProducre) {
		MovieProducre = movieProducre;
	}
	/*
	 * public List<Theater> getTheaters() { return theaters; } public void
	 * setTheaters(List<Theater> theaters) { this.theaters = theaters; }
	 */
	/*
	 * public Screen getScreens() { return screens; } public void setScreens(Screen
	 * screens) { this.screens = screens; }
	 */
	
	
	
	
	/*
	 * @PrePersist public void preConstruct() { DateTime currentDT= new DateTime();
	 * 
	 * if(CreatedAt==null) this.CreatedAt= currentDT;
	 * 
	 * this.updatedAt= currentDT;
	 * 
	 * }
	 */
	
}
