package com.movieplan.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.movieplan.Repository.TheaterMovieRepository;
import com.movieplan.Repository.TheaterRepository;

@Component
public class IntegerToTheaterConverter implements Converter<Integer, Theater> {

	@Autowired
    private TheaterRepository theaterRepository;
	
	@Autowired
    private TheaterMovieRepository theaterMovieRepository;
	
	@Override
	public Theater convert(Integer theaterId) {
		// TODO Auto-generated method stub
		return theaterRepository.findById(theaterId).orElse(null);
	}
	
	
	
}
