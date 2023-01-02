package pl.coderslab.advanced.designpatterns;

import pl.coderslab.advanced.abstractclass.Train;

import java.time.LocalDateTime;

public class AtmApi {
    private BankAccount bankAccount;
    private Transfer transfer;
    private Loan loan;
    private PhoneCard phoneCard;

    public AtmApi(){
        this.bankAccount=new BankAccount();
        this.transfer=new Transfer();
        this.loan=new Loan();
        this.phoneCard=new PhoneCard();
    }

    public void deposit(){
        this.bankAccount.deposit();
    }
    public void payOut(){
        this.bankAccount.payOut();
    }
    public void transferMoney(){
        this.transfer.tranferMoney();
    }
    public void recharge(){
        this.phoneCard.recharge();
    }
    public void getLoan(){
        this.loan.getLoan();
    }

}
