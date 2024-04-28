
package com.eniso.tp4;
import java.util.ArrayList;
public class Bank {
    private ArrayList<Customer> clients;
    public Bank(){
        this.clients = new ArrayList<>();
    }
    public void addCustomer(Customer client){
        clients.add(client);
    }
     public void removeCustomer(Customer client){
        clients.remove(client);
    }
      public Double getTotalBalance() {
        Double totalBalance = 0.0;
        for (Customer customer : clients) {
            totalBalance += customer.getTotalAccountBalance();
        }
        return totalBalance;
    }
}

