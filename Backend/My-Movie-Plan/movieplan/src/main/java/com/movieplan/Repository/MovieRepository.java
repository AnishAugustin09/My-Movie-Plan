package com.movieplan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movieplan.Entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	@Query(value="select * from movie where movie_Category=?1",nativeQuery=true)
	public List<Movie> findByCategory(String category);
}
