package Validation.hotel.management;

public class Restaurant {
    private int tables=20;
    public static  int tableCount=0;
    public void bookTable() {
	// write your code here
        if(tableCount<tables){
            tableCount+=1;
            System.out.println("Table "+tableCount+ " booked");
        }
        else{
            System.out.println("No tables avialable");
        }
    }
}
