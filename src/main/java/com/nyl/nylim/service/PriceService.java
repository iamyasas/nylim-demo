package com.nyl.nylim.service;

import org.springframework.stereotype.Service;

import com.nyl.nylim.domain.Price;

@Service
public class PriceService {

	public Price getPrices() {
		return new Price("fund1", "qucip1", "ticker1");
	}

}
