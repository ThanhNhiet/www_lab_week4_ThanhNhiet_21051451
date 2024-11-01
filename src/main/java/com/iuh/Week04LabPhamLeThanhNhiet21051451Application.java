package com.iuh;

import com.iuh.model.Account;
import com.iuh.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Week04LabPhamLeThanhNhiet21051451Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week04LabPhamLeThanhNhiet21051451Application.class, args);
	}

	@Autowired
	private AccountRepo accountRepo;


	@Override
	public void run(String... args) throws Exception {
//		Random random = new Random();
//		for (int i = 0; i <= 100; i++) {
//			Account account = new Account(i, "Name" + i, random.nextDouble() * 1000);
//			accountRepo.save(account);
//		}
//		accountRepo.findAll().forEach(System.out::println);

		// Delete all accounts
//		accountRepo.deleteAll();

		//page request
//		PageRequest request = PageRequest.of(0, 5);

		// Find all accounts
//		Page<Account> content = accountRepo.findAll(request);
//		List<Account> accounts = content.getContent();
//		accounts.forEach(System.out::println);

		// Find all accounts with balance > 500
		accountRepo.findByBalanceGreaterThan(900).forEach(System.out::println);

//		accountRepo.findByBalanceLessThan(500.0, request).forEach(System.out::println);
	}
}
