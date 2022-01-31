package Validation.transaction;

public class CreditCard extends Payment implements Transaction{
    //private int cashPaid;
    @Override
    public void pay(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via CreditCard");
    }
    public void print(){
        System.out.println(cashPaid);
    }
}
