package violation;
public class HotelManagement {
    public static void main(String[] args){
        BanquetHall bq=new Hall();
        bq.getDetails();
        bq.getSmallDetails();
        NotificationMobile nm=new Mobile();
        nm.sendEventDetails();
        NotificationEmail ne=new Email();
        ne.sendEventDetails();
        Transaction t=new Payment();
        t.payViaUPI(100);
    }
}
