package com.eniso.tp4;

public class Exercice1 {
    public static void main(String[] args) {
        // Exemple de conversions explicites des références
        BankAccount account = new SavingAccount(201 , 3.5 ,1);
        SavingAccount savingsAccount = (SavingAccount) account;
        System.out.println("Conversion explicite réussie : " + (savingsAccount != null));
        BankAccount anotherAccount = new ChekingAccount(202, 1000.0,1);
        ChekingAccount checkingAccount = (ChekingAccount) anotherAccount;
        System.out.println("Conversion explicite réussie : " + (checkingAccount != null));
        // Test de fonctionnalité existante
        SavingAccount savingsAccount1 = new SavingAccount(101, 5.0 ,1);
        savingsAccount1.deposit(1000.0);
        savingsAccount1.withdraw(200.0);
        System.out.println("Solde du compte épargne : " + savingsAccount1.getBalance());
        ChekingAccount checkingAccount1 = new ChekingAccount(102, 500.0,1);
        checkingAccount1.deposit(1500.0);
        checkingAccount1.withdraw(800.0);
        System.out.println("Solde du compte chèque : " + checkingAccount1.getBalance());
        Customer customer = new Customer("John", "Doe");
        customer.addAccount(savingsAccount1);
        customer.addAccount(checkingAccount1);
        System.out.println("Solde total du client : " + customer.getTotalAccountBalance());
        Bank bank = new Bank();
        bank.addCustomer(customer);
        System.out.println("Solde total de la banque : " + bank.getTotalBalance());
}

}
