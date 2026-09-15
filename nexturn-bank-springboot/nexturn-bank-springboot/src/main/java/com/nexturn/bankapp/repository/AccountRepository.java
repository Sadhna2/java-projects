package com.nexturn.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexturn.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
