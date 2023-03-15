package com.example.AtmCard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AtmCard.model.CardDetails;


@Repository
public interface CardRepository extends CrudRepository<CardDetails, Long>{

	List<CardDetails> findByCustomerId(int customerId);

}