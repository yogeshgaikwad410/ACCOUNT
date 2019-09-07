package com.example.demo.service.impl;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CurrentAccountDao;
import com.example.demo.dao.SavingAccountDao;
import com.example.demo.model.CurrentAccount;
import com.example.demo.model.SavingAccount;
import com.example.demo.service.AccountService;



@Service
public class AccountServiceImpl implements AccountService {

	/* private static int nextAccountNumber = 11223145; */

	@Autowired
	private CurrentAccountDao currentAccountDao;
	@Autowired
	private SavingAccountDao savingAccountDao;

	@Autowired
	private	AccountServiceImpl accountServiceImpl;

	public CurrentAccount createCurrentAccount() {
		CurrentAccount currentAccount = new CurrentAccount();
		
		currentAccount.setAccountBalance(new BigDecimal(0.0));
	
		
		currentAccountDao.save(currentAccount);

		return currentAccountDao.findByAccountNumber(currentAccount.getAccountNumber());
	}

	public SavingAccount createSavingAccount() {
		SavingAccount savingAccount = new SavingAccount();
	
		savingAccount.setAccountBalance(new BigDecimal(0.0));

		savingAccountDao.save(savingAccount);

		return savingAccountDao.findByAccountNumber(savingAccount.getAccountNumber());
	}
	/*
	 * private int accountGen() { return ++nextAccountNumber; }
	 */
}
