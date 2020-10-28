package Monopoly;

public class BankAccount {
    int balance;

    // set balance to startbalance
    public BankAccount () {
        balance = 1000;
    }
    // get square value from player nad find new balance

    public void getSquareValue (int newSqaure) {
        balance = balance + newSqaure;

    }
     // return balance to monopolygame
    public int getBalance () {
        return balance;
    }
}


