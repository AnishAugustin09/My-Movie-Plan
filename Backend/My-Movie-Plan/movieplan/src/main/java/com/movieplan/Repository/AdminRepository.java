package com.movieplan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieplan.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
