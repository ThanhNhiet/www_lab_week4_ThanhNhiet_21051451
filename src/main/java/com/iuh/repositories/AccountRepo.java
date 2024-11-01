package com.iuh.repositories;

import com.iuh.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

    List<Account> findByBalanceGreaterThan(double amount);

    List<Account> findByBalanceLessThan(double amount, Pageable pageable);
    
}
