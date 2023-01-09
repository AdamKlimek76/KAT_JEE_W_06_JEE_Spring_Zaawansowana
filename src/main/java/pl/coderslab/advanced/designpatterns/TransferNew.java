package pl.coderslab.advanced.designpatterns;

public class TransferNew {

    public double lastTransferAmount;
    public String lastAccountToTransfer;

    public TransferNew(){}

    public void transfer(double amount, String AccountNumber){
        System.out.println("Przelano " + amount + " na konto " + AccountNumber);
    }

}
