package com.example.AtmCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AtmCard.model.CardDetails;
import com.example.AtmCard.model.Customer;
import com.example.AtmCard.repository.CardRepository;

@RestController
public class CardController {
	@Autowired
	private CardRepository cardRepository;
	
	@PostMapping("/cards")
	public List<CardDetails> getCardDetails(@RequestBody Customer customer){
		List<CardDetails> cards=cardRepository.findByCustomerId(customer.getCustomerId());
		return cards;
	}

}