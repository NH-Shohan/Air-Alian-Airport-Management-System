package Classes;

import Interfaces.TicketInterface;

public abstract class Ticket implements TicketInterface {

    private int accountNumber;
    double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}