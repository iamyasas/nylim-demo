package com.nyl.nylim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyl.nylim.domain.Price;
import com.nyl.nylim.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController {
	
	@Autowired private PriceService priceService;

	@GetMapping
	public ResponseEntity<List<Price>> getPrices() {
		return ResponseEntity.ok(priceService.getPrices());
	}
}
