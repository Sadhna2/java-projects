package com.nexturn.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexturn.bankapp.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}