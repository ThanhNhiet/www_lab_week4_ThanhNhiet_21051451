package com.iuh.repositories;

import com.iuh.model.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepoTest {

    @Autowired
    private AccountRepo accountRepo;

    @Test
    void findByBalanceGreaterThan() {
        List<Account> accs = accountRepo.findByBalanceGreaterThan(900);
        assertNotNull(accs);
        assertEquals(10, accs.size());
    }

    @Test
    void findByBalanceLessThan() {
        List<Account> accs = accountRepo.findByBalanceLessThan(500, null);
        assertNotNull(accs);
        assertEquals(40, accs.size());
    }
}