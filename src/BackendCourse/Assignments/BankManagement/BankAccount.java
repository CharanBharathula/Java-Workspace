package BackendCourse.Assignments.BankManagement;

import java.util.ArrayList;

public class BankAccount {

     double balance;
     String ownerName;
     ArrayList<String> transactionHistory;
     
     public BankAccount( double balance, String ownerName ) {
          this.balance = balance;
          this.ownerName = ownerName;
          this.transactionHistory = new ArrayList<String>();
     }

     public double getBalance() {
          return balance;
     }

     void deposit(int amount) {
          transactionHistory.add( "Deposited: " + amount );
          balance += amount;
     }
     
     void withdraw(int amount) {
          if( balance < amount ) {
               System.out.println("Insufficient balance");
               return;
          }
          transactionHistory.add( "Withdrawn: " + amount );
          balance -= amount;
     }

     void printTransactionHistory() {
          System.out.println("Transaction History: ");
          for( String transaction : transactionHistory ) {
               System.out.println(transaction);
          }
     }
}