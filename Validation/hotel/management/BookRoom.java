package Validation.hotel.management;

public class BookRoom {
    private int rooms=20;
    public static int roomCount=0;
    public void bookRoom() {
        // write your code here
        if(roomCount<rooms){
            roomCount+=1;
            System.out.println("Room "+roomCount+ " booked");
        }
        else{
            System.out.println("No rooms avialable");
        }
    }
}
