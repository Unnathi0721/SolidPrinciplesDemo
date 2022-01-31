package violation;

public class Payment implements Transaction {
    protected int cashPaid;
    public void pay(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via cash");
    }
    public void payViaDebit(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via DebitCard");
    }
    public void payViaCredit(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via CreditCard");
    }
    public void payViaUPI(int cash){
        this.cashPaid=cash;
        System.out.println("Payment of INR "+cash + " paid via UPI");
        //super.pay(cash);
    }
}