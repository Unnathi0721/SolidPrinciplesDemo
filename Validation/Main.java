package Validation;
import Validation.bonquet.*;
import Validation.notification.*;
import Validation.hotel.management.*;
import Validation.transaction.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Single Responsibility
        BookRoom br = new BookRoom();
        Restaurant r = new Restaurant();
        br.bookRoom();
        r.bookTable();

        //Open-closed and Liskov Substitution
        Transaction p=new Payment();
        Transaction cc=new CreditCard();
        p.pay(20);
        cc.pay(40);
        p.print();
        cc.print();

        //Liskov's substitution


        //Interface Segregation
        BonquetHall lh=new LargeHall();
        HallsAvailability ha=new SmallHall();
        BonquetHall sh=new SmallHall();
        sh.getDetails();
        lh.getDetails();
        ha.getAvailable();
        //Dependency Inversion
        BonquetHall bh = new LargeHall();
        bh.getDetails();
        Select s = new Select();
        Message m;
        String st = sc.next();
        if (st == "E") {
            m = s.choose(1);
        } else {
            m = s.choose(2);
        }
        m.createMsg("Hi Customer");
        Notification n = m;
        n.sendEventDetails();

    }
}
