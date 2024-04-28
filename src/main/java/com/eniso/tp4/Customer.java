
package com.eniso.tp4;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts  ;
    public Customer(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<BankAccount>();
    }
    public void addAccount(BankAccount compte){
        accounts.add(compte);
    }
    public void removeAccount(BankAccount compte){
        accounts.remove(compte);
    }
     public Double getTotalAccountBalance() {
        double totalBalance = 0.0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        if (sourceAccount.withdraw(amount) < sourceAccount.balance ) {
            System.out.println("impossible : amount >>>> balance source compte");
        } else {
            destinationAccount.deposit(amount);
        }
    }
}

