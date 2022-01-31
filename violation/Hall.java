package violation;

public class Hall implements BanquetHall {
private int capacity = 1000;
private int cost = 600000;
private int available = 4;
private int booked = 2;
private int total = 6;

public void getDetails() {
        System.out.println("Capacity : " + capacity);
        System.out.println("Cost : " + cost);
        }

public void getAvailable() {
        System.out.println("No. of Small Halls Available : " + available);
        }

public void getTotalHalls() {
        System.out.println("Total no. of Small Halls  : " + total);
        }

public void getBooked() {
        System.out.println("No. of Small Halls Booked : " + booked);
        }

private int small_capacity = 1000;
private int small_cost = 600000;
private int small_available = 4;
private int small_booked = 2;
private int small_total = 6;

public void getSmallDetails() {
        System.out.println("Capacity : " + small_capacity);
        System.out.println("Cost : " + small_cost);
        }

public void getSmallAvailable() {
        System.out.println("No. of Large Halls Available : " + small_available);
        }

public void getSmallTotalHalls() {
        System.out.println("Total no. of Large Halls  : " + small_total);
        }

public void getSmallBooked() {
        System.out.println("No. of Large Halls Booked : " + small_booked);
        }
}