package com.movieplan.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieplan.Entity.Admin;
import com.movieplan.Entity.Booking;
import com.movieplan.Entity.Customer;
import com.movieplan.Entity.Movie;
import com.movieplan.Entity.Theater;
import com.movieplan.Entity.TheaterMovie;
import com.movieplan.Repository.MovieRepository;


public interface MoviePlanService {
	
	//----------------------------Movies CRUD-----------------------
	
	public List<Movie> getAllMovies();
	public Movie getMovieById(int id);
	public Movie addMovie(Movie m);
	public void updateMovie(Movie m, int id);
	public void deleteMovie(int id);
	
	public List<Movie> getByCat(Movie m);
	
	public List<Movie> getLatest(String m);
	
	
	//----------------------------Theater CRUD-----------------------
	
	public List<Theater> getallTheater();
	public Theater getTheaterByID(int id);
	public Theater addTheater(Theater m);
	public void updateTheater(Theater m, int id);
	public void deleteTheater(int id);
	
	//---------------------------Customer CRUD-------------------------
	
	public List<Customer> getallCustomer();
	public Customer getCustomerByID(String id);
	public Customer addCustomer(Customer m);
	public void updateCustomer(Customer m, String id);
	public void deleteCustomer(String id);
	
	public String loginCustomer(Customer c);
	
	//---------------------------Admin CRUD------------------------------
	
	public List<Admin> getallAdmin();
	public Admin getAdminByID(String id);
	public Admin addAdmin(Admin m);
	public void updateAdmin(Admin m, String id);
	public void deleteAdmin(String id);
	
	public String LoginAdmin(Admin c);
	
	//---------------------------Booking CRUD-----------------------------
	
	public List<Booking> getallBooking();
	public Booking getBookingByID(int id);
	public Booking addBooking(Booking m);
	public void deleteBooking(int id);
	
	
	//--------------------------------Theaters Movie -------------------------------
	
	public List<TheaterMovie> getall();
	
	public List<TheaterMovie> findByTheater(int id);
	
	
	
}
