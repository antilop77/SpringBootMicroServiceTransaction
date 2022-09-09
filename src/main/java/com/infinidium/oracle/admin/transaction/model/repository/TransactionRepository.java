package com.infinidium.oracle.admin.transaction.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinidium.oracle.admin.transaction.model.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	//select * from TRANSACTION where user_id = ?
	//public List<Transaction> findAllByUserId2(Integer userID);
}
