package Validation.transaction;

public class DebitCard extends Payment implements Transaction{
    //private int cashPaid;
    @Override
    public void pay(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via DebitCard");
    }
    public void print(){
        System.out.println(cashPaid);
    }
}

