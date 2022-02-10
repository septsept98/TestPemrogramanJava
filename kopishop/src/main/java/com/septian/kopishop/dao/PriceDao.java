package com.septian.kopishop.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.septian.kopishop.dto.Price;

@Component
public class PriceDao {

	@Autowired
	EntityManager em;

	public List<Price> getAll() throws Exception{
		List<Price> listResult = new ArrayList<>();
		
		
		return listResult; 
	}
	
	public Price insert(Price price) throws Exception {
		em.persist(price);
		
		return s;
	}
}
