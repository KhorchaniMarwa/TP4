
package com.eniso.tp4;


public class BankAccount {
    protected int accountNumber ;
    protected double balance;
   public  BankAccount(int accountNumber , double balance){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
    }
  /*   public int getAccountNumber(){
         return accountNumber ;
     }
     public void setAccountNumber(int accountNumber){
         this.accountNumber = accountNumber ;
     }
*/
     public  double getBalance(){
         return balance;
     }
     /*
     public void setBalance(double balance){
         this.balance = balance;
     }
     */
     public double deposit(double montant){
         
          return balance += montant;
          
    }

     public double withdraw(double montant){
         return balance -= montant;
     }
     
}
