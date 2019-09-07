
  package com.example.demo.service;
  
  import com.example.demo.model.CurrentAccount; 
  import com.example.demo.model.SavingAccount;
  
  public interface AccountService {
  
  CurrentAccount createCurrentAccount();

  SavingAccount createSavingAccount();
  
 // void deposit(String accountType, double amount);//Principal principal
  
//  void withdraw(String accountType, double amount);//Principal principal
  
  }
 