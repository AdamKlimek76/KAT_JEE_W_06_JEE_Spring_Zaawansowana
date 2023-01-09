package pl.coderslab.advanced.designpatterns;

public class LoanNew {

    public double lastLoanAmount;

    public LoanNew() {
    }

    public void getLoan(double loanAmount) {
        this.lastLoanAmount=loanAmount;
        System.out.println("Pobrano " + loanAmount +  " pożyczki");
    }

}
