package Validation.transaction;

public class Payment implements Transaction {
    public int cashPaid;
    public void pay(int cash){
        cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via cash");
    }
    public void print(){
        System.out.println(cashPaid);
    }
}