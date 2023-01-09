package pl.coderslab.advanced.designpatterns;

import java.text.DecimalFormat;

public class BankAccountNew {

    public double amount;
    public double lastPayOut;
    public double lastDeposit;

    public BankAccountNew() {
        this.amount = 0.00;
        this.lastDeposit = 0.00;
        this.lastPayOut = 0.00;
    }

    public void deposit(double depositAmount) {
        this.amount += depositAmount;
        System.out.println("Wpłacono " + depositAmount + " Stan konta wynosi: " + this.amount);
    }

    public void payOut(double payOutAmount) {
        this.amount -= payOutAmount;
        System.out.println("Wypłacono " + payOutAmount + " Stan konta wynosi: " + this.amount);
    }

    public double getAmount() {
        return amount;
    }
}
