package com.tavant.AccountRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.AccountRestApi.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
