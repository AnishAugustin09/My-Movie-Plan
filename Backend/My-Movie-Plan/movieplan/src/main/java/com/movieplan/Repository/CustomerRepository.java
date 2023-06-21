package com.movieplan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieplan.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	@Query(value="select * from customer where email=?1 and password=?2",nativeQuery=true)
	public Customer customerLogin(String email, String password);
	
	@Query(value="select * from customer where email=?1",nativeQuery=true)
	public Customer findByEmail(String email);
}
