package com.infinidium.oracle.admin.transaction.model.service;

import java.util.List;

import javax.servlet.annotation.ServletSecurity.TransportGuarantee;

import org.springframework.stereotype.Service;

import com.infinidium.oracle.admin.transaction.model.entity.Transaction;
import com.infinidium.oracle.admin.transaction.model.repository.TransactionRepository;
import com.infinidium.oracle.admin.transaction.utility.Util;

@Service
public class TransactionService extends AbstractTransactionService {
	@Override
	public List<Transaction> getAll() {		
		return transactionRepository.findAll();
	}

	@Override
	public void deleteByID(Integer id) {
		try {
			transactionRepository.deleteById(id);
		}
		catch (IllegalArgumentException e) {
			Util.showException(e);
		}
		
	}

	/*@Override
	public List<Transaction> findAllByUserId1(Integer userID) {
		// TODO Auto-generated method stub
		//return transactionRepository.findAll(); // .findAllById(userID);
		return transactionRepository.findAllById(ids)
	}*/

	@Override
	public Transaction save(Transaction entity) {
		// TODO Auto-generated method stub
		return transactionRepository.save(entity);
	}
}
