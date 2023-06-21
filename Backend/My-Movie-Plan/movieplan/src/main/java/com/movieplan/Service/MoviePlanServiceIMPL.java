
package com.movieplan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.movieplan.Entity.Admin;
import com.movieplan.Entity.Booking;
import com.movieplan.Entity.Customer;
import com.movieplan.Entity.IntegerToTheaterConverter;
import com.movieplan.Entity.Movie;
import com.movieplan.Entity.Theater;
import com.movieplan.Entity.TheaterMovie;
import com.movieplan.Repository.AdminRepository;
import com.movieplan.Repository.BookingRepository;
import com.movieplan.Repository.CustomerRepository;
import com.movieplan.Repository.MovieRepository;
import com.movieplan.Repository.TheaterMovieRepository;
import com.movieplan.Repository.TheaterRepository;
@Service
public class MoviePlanServiceIMPL implements MoviePlanService{
	
	
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private TheaterRepository theaterRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private TheaterMovieRepository theatermovieRepository;
	
	@Autowired
	private IntegerToTheaterConverter ith;
	
	

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(int id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie addMovie(Movie m) {
		return movieRepository.save(m);
	}

	@Override
	public void updateMovie(Movie m, int id) {
		if(movieRepository.findById(id).isPresent()) {
			Movie movie = movieRepository.findById(id).get();
			movie.setMovieName(m.getMovieName());
			movie.setMovieCertifiedas(m.getMovieCertifiedas());
			movie.setMovieRating(m.getMovieRating());
			movie.setMovieDirector(m.getMovieDirector());
			movie.setMovieProducre(m.getMovieProducre());
			movie.setMovieActorName(m.getMovieActorName());
			movie.setMovieCategory(m.getMovieCategory());
			movie.setImage(m.getImage());
			movieRepository.save(movie);
		}
	}

	@Override
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}
	
	public List<Movie> getByCat(Movie m){
		return movieRepository.findByCategory(m.getMovieCategory());
	}
	
	public List<Movie> getLatest(String m){
		return movieRepository.findByCategory(m);
	}

	
	//--------------------------------------------------------------
	
	
	@Override
	public List<Theater> getallTheater() {
		return theaterRepository.findAll();
	}

	@Override
	public Theater getTheaterByID(int id) {
		return theaterRepository.findById(id).get();
	}

	@Override
	public Theater addTheater(Theater m) {
		return theaterRepository.save(m);
	}

	@Override
	public void updateTheater(Theater m, int id) {
		if(theaterRepository.findById(id).isPresent()) {
			Theater theater= theaterRepository.findById(id).get();
			theater.setTheaterName(m.getTheaterName());
			theater.setTheaterAddress(m.getTheaterAddress());
			theater.setTheaterCity(m.getTheaterCity());
			theater.setTheaterState(m.getTheaterState());
			
			 theaterRepository.save(theater);
		}
	}

	@Override
	public void deleteTheater(int id) {
		theaterRepository.deleteById(id);
		
	}
	
	@Override
	public List<TheaterMovie> getall() {
		return theatermovieRepository.findAll();
	}
	
	public List<TheaterMovie> findByTheater(int id){
		return theatermovieRepository.findByTheater(id);
		
	}
	
	
	
	//---------------------------------------------------------------

	@Override
	public List<Customer> getallCustomer() {
		return customerRepository.findAll();
	}

	public Customer getCustomerByID(String id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public Customer addCustomer(Customer m) {
		
		return customerRepository.save(m);
	}

	@Override
	public void updateCustomer(Customer m, String id) {
		if(customerRepository.findById(id).isPresent()) {
			Customer cust= customerRepository.findById(id).get();
			cust.setCustomerName(m.getCustomerName());
			cust.setCustomerNumber(m.getCustomerNumber());
			cust.setCustomerEmail(m.getCustomerEmail());
			cust.setaddress(m.getaddress());
			customerRepository.save(cust);
		}
		
	}

	@Override
	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
		
	}
	
	public String loginCustomer(Customer c) {
		BCryptPasswordEncoder crypt= new BCryptPasswordEncoder(); 
		String status ="";
		
		if(customerRepository.findById(c.getCustomerEmail()).isPresent()) {
			Customer customer = customerRepository.findById(c.getCustomerEmail()).get();
			
			if((c.getCustomerEmail().equals(customer.getCustomerEmail()))&&crypt.matches(c.getPassword(), customer.getPassword())){
				
				status= "true";
			}
			else
				status="false";
			
		}
		return status;
		
			
			
	

	}
	
	//-----------------------------------------------------------

	@Override
	public List<Admin> getallAdmin() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminByID(String id) {
		return adminRepository.findById(id).get();
	}

	@Override
	public Admin addAdmin(Admin a) {
		
		return adminRepository.save(a);
	}

	@Override
	public void updateAdmin(Admin m, String id) {
		if(adminRepository.findById(id).isPresent()) {
			Admin admin= adminRepository.findById(id).get();
			admin.setAdminEmail(m.getAdminEmail());
			admin.setPassword(m.getPassword());
			adminRepository.save(admin);
		}
		
	}

	@Override
	public void deleteAdmin(String id) {
		adminRepository.deleteById(id);
		
	}
	
	public String LoginAdmin(Admin a) {
		BCryptPasswordEncoder crypt= new BCryptPasswordEncoder(); 
		String status ="";
		
		if(adminRepository.findById(a.getAdminEmail()).isPresent()) {
			Admin admin= adminRepository.findById(a.getAdminEmail()).get();
			if((a.getAdminEmail().equals(admin.getAdminEmail()))&&crypt.matches(a.getPassword(), admin.getPassword())) {
				status="true";
			}else
				status="false";
		}
		return status;
		
	}

	
	
	//------------------------------------------------------------------
	
	@Override
	public List<Booking> getallBooking() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingByID(int id) {
		return bookingRepository.findById(id).get();
	}

	@Override
	public Booking addBooking(Booking m) {
		return bookingRepository.save(m);
	}

	@Override
	public void deleteBooking(int id) {
		bookingRepository.deleteById(id);
		
	}

	
	
	
}
