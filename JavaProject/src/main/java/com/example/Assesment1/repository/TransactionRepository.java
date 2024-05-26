package com.example.Assesment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assesment1.models.WalletUser;

public interface TransactionRepository extends JpaRepository<WalletUser,Long> {

}
