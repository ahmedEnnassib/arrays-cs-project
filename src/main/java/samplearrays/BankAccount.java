package samplearrays;

import java.awt.*;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    Double[] transactions = new Double[1000];
    int index = 0;
    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Error, Only positive amounts are accepted !");
        }else{
            currentBalance += amount;
            transactions[index] = amount;
            index++;
            System.out.println(name +", your new balance after the deposit of " + amount + " is : "+currentBalance);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Error, Only positive amounts are accepted !");
        } else if (amount > currentBalance) {
            System.out.println("Unseccessful withdrawal !");
        }else{
            currentBalance -= amount;
            transactions[index] = -amount;
            index++;
        }
    }

    public void displayTransactions(){
        System.out.println("The transaction History for " + name + " : ");
        for(int i = 0 ; i < index;i++){
            System.out.println(transactions[i]+",");
        }
    }

    public void displayBalance(){
        System.out.println(name+", Your current balance is : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
