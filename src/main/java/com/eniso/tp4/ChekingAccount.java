
package com.eniso.tp4;


public class ChekingAccount extends BankAccount {
    private double overdraftAllowed ;
    
    public ChekingAccount(int accountNumber, double balance, double overdraftAllowed) {
        super(accountNumber, balance);
        this.overdraftAllowed = overdraftAllowed;
    } 
    public void setOverdraftAllowed(double overdraftallowed){
        this.overdraftAllowed = overdraftAllowed; 
    }
    public double getOverdraftAllowed(){
        return overdraftAllowed ;
    }

     public double withdraw(double amount) {
        double availableBalance = balance + overdraftAllowed; // Solde disponible incluant la protection contre les découverts

        if (amount <= availableBalance) {
            balance -= amount;
            return balance;
        } else {
            return -1;
        }
    }
     
    }
    

