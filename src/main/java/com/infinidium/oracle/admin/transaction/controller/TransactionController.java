package com.infinidium.oracle.admin.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infinidium.oracle.admin.transaction.model.entity.Transaction;
import com.infinidium.oracle.admin.transaction.model.service.AbstractTransactionService;

@RequestMapping("api/transaction")
@RestController
public class TransactionController {
	
	@Autowired
	private AbstractTransactionService transactionService;
	
	/**
	 * @param userID
	 * @return
	 */
	/*@GetMapping("{userID}")
	public ResponseEntity<List<Transaction>> getAllByUserId(@PathVariable Integer userID) {		
		return ResponseEntity.ok(transactionService.findAllByUserId(userID));
	}*/
	
	@GetMapping
	public ResponseEntity<List<Transaction>> getAll() {		
		return ResponseEntity.ok(transactionService.getAll());
	}
	
	// api/transaction/transactionID
	@PostMapping("{transactionID}")
	public ResponseEntity<Transaction> save(@PathVariable Integer transactionID) {
		transactionService.deleteByID(transactionID);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Transaction> delete(@RequestParam Transaction transaction) {
		Transaction savedTransaction = transactionService.save(transaction);
		return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
	}
}
