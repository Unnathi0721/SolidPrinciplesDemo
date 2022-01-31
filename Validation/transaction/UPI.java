package Validation.transaction;

public class UPI extends Payment implements Transaction {
    //private int cashPaid;
    @Override
    public void pay(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via UPI");
        //super.pay(cash);
    }
    public void print(){
        System.out.println(cashPaid);
    }
}
