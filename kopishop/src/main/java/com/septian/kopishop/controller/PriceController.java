package com.septian.kopishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.septian.kopishop.dto.Price;

@RestController
@RequestMapping("price")
public class PriceController {
	

	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Price priceReq) throws Exception {
		Price price =
		
		return ResponseEntity.ok().body(price);
	}
	
}
