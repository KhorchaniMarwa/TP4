
package com.eniso.tp4;


public class SavingAccount extends BankAccount {
    private double intrestRate;
 public SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.intrestRate = interestRate ;
    }
 public double getInterestRate(){
     return intrestRate ;
 }    
double interest;
 public void calculateInterest() {
     interest = balance * intrestRate / 100 ;
    balance += interest ;
    
}
 public double withdraw(double amount) {
        final double MAX_WITHDRAWAL = 1000.0; 

        if (amount <= balance && amount <= MAX_WITHDRAWAL) {
            balance -= amount;
           return balance;
    }
        return 0;
 }
}
