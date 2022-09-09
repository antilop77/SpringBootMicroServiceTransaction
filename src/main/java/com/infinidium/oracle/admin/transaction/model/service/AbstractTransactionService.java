package com.infinidium.oracle.admin.transaction.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinidium.oracle.admin.transaction.model.entity.Transaction;
import com.infinidium.oracle.admin.transaction.model.repository.TransactionRepository;

public abstract class AbstractTransactionService implements EntityService<Transaction, Integer> {
	@Autowired
	protected TransactionRepository transactionRepository;
	
	//public abstract List<Transaction> findAllByUserId1(Integer userID);
}
