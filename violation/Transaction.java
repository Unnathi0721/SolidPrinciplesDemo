package violation;

public interface Transaction{
    void pay(int cash);
    void payViaDebit(int cash);
    void payViaCredit(int cash);
    void payViaUPI(int cash);
}