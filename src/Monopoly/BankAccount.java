package Monopoly;

public class BankAccount {
    int account;
    static int bottomBalance = 0;

    // set balance to startbalance
    public BankAccount () {
        account = 1000;
    }
    // get square value from player nad find new balance

    public void setAccount (int account) {
        this.account = account;

    }

    public void addPoints ( int squareValue){
        account += squareValue;
        if (account<bottomBalance){
            account = bottomBalance;
        }

    }
     // return balance to monopolygame
    public int getBalance () {
        return account;
    }
}


