package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private Long transactionId = 1L;

    @Autowired
    private TransactionRepository transactionRepo;

    public Transaction save (Transaction transaction) {
        if (transaction.getId() == null)
            transaction.setId(transactionId++);
        return transactionRepo.save(transaction);
    }

    public Transaction findById(Integer transactionId) {
        return transactionRepo.findById(transactionId);
    }

    public List<Transaction> findAll() {
        return transactionRepo.findAll();
    }

//    public void delete(Integer transactionId) {
//        transactionRepo.delete(transactionId);
//    }

}
