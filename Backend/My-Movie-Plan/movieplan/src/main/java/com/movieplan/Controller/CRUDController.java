package com.movieplan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieplan.Entity.Admin;
import com.movieplan.Entity.Booking;
import com.movieplan.Entity.Customer;
import com.movieplan.Entity.IntegerToTheaterConverter;
import com.movieplan.Entity.Movie;
import com.movieplan.Entity.Theater;
import com.movieplan.Entity.TheaterMovie;
import com.movieplan.Repository.TheaterRepository;
import com.movieplan.Service.MoviePlanService;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200/")
public class CRUDController {

	@Autowired
	private MoviePlanService moviePlan;
	@Autowired
	private TheaterRepository theaterRepository;
	
	@Autowired
	private IntegerToTheaterConverter ith;
	
	@GetMapping("/")
	public List<Movie> getAllMovie(){
		return moviePlan.getAllMovies();
	}
	
	@PostMapping("/latest")
	public List<Movie> getByCat(@RequestBody Movie m){
		return moviePlan.getByCat(m);
	}
	
	@GetMapping("/movie/{latest}")
	public List<Movie> getLatest(@PathVariable String latest){
		return moviePlan.getLatest(latest);
	}
	
	@GetMapping("/{id}")
	public Movie getById(@PathVariable int id) {
		return moviePlan.getMovieById(id);
	}
	
	@PostMapping("/addmovie")
	public Movie addMovie(@RequestBody Movie m) {
		return moviePlan.addMovie(m);
	}
	
	@PutMapping("/updateMovie/{id}")
	public void updateMovie(@RequestBody Movie m, @PathVariable int id) {
		moviePlan.updateMovie(m, id);
	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public void deleteMovie(@PathVariable int id) {
		moviePlan.deleteMovie(id);
	}
	
	//---------------------------------------------------------
	
	@GetMapping("/theaters")
	public List<Theater> getallTheater(){
		return moviePlan.getallTheater();
	}
	
	@GetMapping("/theater/{id}")
	public Theater getTheaterById(@PathVariable int id) {
		return moviePlan.getTheaterByID(id);
	}
	
	@PostMapping("/addTheater")
	public Theater addTheater(@RequestBody Theater t) {
		return theaterRepository.save(t);
	}
	
	@PutMapping("/updateTheater/{id}")
	public void updateTheater(@RequestBody Theater t,@PathVariable int id) {
		moviePlan.updateTheater(t, id);
	}
	
	@DeleteMapping("/deleteTheater/{id}")
	public void deleteTheater(@PathVariable int id) {
		moviePlan.deleteTheater(id);
	}
	
	@GetMapping("/theaterMovie")
	public List<TheaterMovie> getallTheaters(){
		return moviePlan.getall();
	}
	
	@GetMapping("/theaterMovie/{id}")
	public List<TheaterMovie> getTheaters(@PathVariable int id){
		return moviePlan.findByTheater(id);
	}
	
	
	
	
	
	//-----------------------------------------------------------
	
	@GetMapping("/Customers")
	public List<Customer> getallCustomer(){
		return moviePlan.getallCustomer();
	}
	
	@GetMapping("/Customer/{id}")
	public Customer getCustomerById(@PathVariable String id) {
		return moviePlan.getCustomerByID(id);
	}
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer t) {
		
		  BCryptPasswordEncoder crypt= new BCryptPasswordEncoder();
		  String encodedPass=crypt.encode(t.getPassword()); 
		  t.setPassword(encodedPass);
		 
		return moviePlan.addCustomer(t);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public void updateCustomer(@RequestBody Customer t,@PathVariable String id) {
		moviePlan.updateCustomer(t, id);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable String id) {
		moviePlan.deleteCustomer(id);
	}
	
	//-------------------------------------------------------------------
	
	@GetMapping("/Admins")
	public List<Admin> getallAdmin(){
		return moviePlan.getallAdmin();
	}
	
	@GetMapping("/Admin/{id}")
	public Admin getAdminById(@PathVariable String id) {
		return moviePlan.getAdminByID(id);
	}
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin t) {
		
		  BCryptPasswordEncoder crypt= new BCryptPasswordEncoder(); 
		  String adminPassEncode= crypt.encode(t.getPassword());
		  t.setPassword(adminPassEncode);
		 
		return moviePlan.addAdmin(t);
	}
	
	@PutMapping("/updateAdmin/{id}")
	public void updateAdmin(@RequestBody Admin t,@PathVariable String id) {
		moviePlan.updateAdmin(t, id);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable String id) {
		moviePlan.deleteAdmin(id);
	}
	
	//--------------------------------Booking-------------------------
	
	
	@GetMapping("/Bookings")
	public List<Booking> getallBooking(){
		return moviePlan.getallBooking();
	}
	
	@GetMapping("/Booking/{id}")
	public Booking getBookingById(@PathVariable int id) {
		return moviePlan.getBookingByID(id);
	}
	
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking t) {	 
		return moviePlan.addBooking(t);
	}
	
	@DeleteMapping("/deleteBooking/{id}")
	public void deleteBooking(@PathVariable int id) {
		moviePlan.deleteBooking(id);
	}
	
	
	
	//---------------------------------Login -----------------------------
	
	@PostMapping("/login")
	public String loginCustomer(@RequestBody Customer c) {
		return moviePlan.loginCustomer(c);
	}
	
	@PostMapping("/admin")
	public String loginAdmin(@RequestBody Admin a) {
		return moviePlan.LoginAdmin(a);
	}
	
	
}
