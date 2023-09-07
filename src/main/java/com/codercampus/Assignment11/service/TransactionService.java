package com.codercampus.Assignment11.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	
	@Autowired
	private TransactionRepository transactionRepo;

	public List<Transaction> findAll() {
		List<Transaction> transactions = transactionRepo.findAll();
		return transactions;
	
	}

	public Transaction findById(Long transactionId) {
		List<Transaction> transactions = transactionRepo.findAll();
		List<Transaction> match = transactions.stream()
									.filter(t -> t.getId().equals(transactionId))
									.collect(Collectors.toList());
		return match.get(0);
		
	}

}
