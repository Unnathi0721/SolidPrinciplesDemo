package Validation.bonquet;
public class LargeHall implements BonquetHall,HallsAvailability{
    private int capacity=1000;
    private int cost= 600000;
    private int available=4;
    private int booked=2;
    private int  total=6;
    public void getDetails(){
        System.out.println("Capacity : "+capacity);
        System.out.println("Cost : "+cost);
    }
    public void getAvailable(){

        System.out.println("No. of Large Halls Available : "+available);
    }
    public void getTotalHalls(){

        System.out.println("Total no. of Large Halls  : "+total);
    }
    public void getBooked(){

        System.out.println("No. of Large Halls Booked : "+booked);
    }
}
