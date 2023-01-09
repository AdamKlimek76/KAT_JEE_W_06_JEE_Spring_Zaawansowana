package pl.coderslab.advanced.designpatterns;

public class AtmApiNew {

    private BankAccountNew bankAccountNew;
    private LoanNew loanNew;
    private TransferNew transferNew;

    public AtmApiNew() {
        this.bankAccountNew = new BankAccountNew();
        this.loanNew = new LoanNew();
        this.transferNew = new TransferNew();
    }

    public void payOut(double amount) {
        this.bankAccountNew.payOut(amount);
    }

    public void deposit(double amount) {
        this.bankAccountNew.deposit(amount);
    }

    public void getLoan(double loanAmount) {
        this.loanNew.getLoan(loanAmount);
    }

    public void transfer(double amount, String account){
        this.transferNew.transfer(amount, account);
    }
}
