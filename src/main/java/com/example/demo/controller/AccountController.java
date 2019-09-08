package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CurrentAccountDao;
import com.example.demo.dao.SavingAccountDao;
import com.example.demo.model.CurrentAccount;
import com.example.demo.model.SavingAccount;
import com.example.demo.service.impl.AccountServiceImpl;


@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountServiceImpl accountServiceImpl;
	
	@Autowired
	CurrentAccountDao currentAccountDao;
	
	@Autowired
	SavingAccountDao savingAccountDao;
	
	@PostMapping("/CurrentAccount")
	public ResponseEntity<String> createCurrentAccount(@RequestBody CurrentAccount currentAccount)
	{
		accountServiceImpl.createCurrentAccount();
		currentAccount.setAccountBalance(new BigDecimal(0.0));
		System.out.println("welcome to Account");
		return new ResponseEntity<String>("Created Current A/c SuccessFully ", HttpStatus.CREATED);
	}
	

	
	
	
	
	@PostMapping("/SavingAccount")
	public ResponseEntity<String> createSavingAccount(@RequestBody SavingAccount savingAccount)
	{
		accountServiceImpl.createSavingAccount();
		System.out.println("welcome to Saving Account");
		return new ResponseEntity<String>("Created Saving A/c Succesfully",HttpStatus.CREATED);
	}
	
	public void welcomeBank()
	{
		System.out.println("hiii all users");
		System.out.println("Welcome to Bank Account");
	}
	
		
}
