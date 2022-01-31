package violation;

public class Hotel {
    final private int tables=20;
    private int tableCount=0;
    public void bookTable() {
        // write your code here
        if(tableCount<tables){
            tableCount+=1;
            System.out.println("Table "+tableCount+ " booked");
        }
        else{
            System.out.println("No tables available");
        }
    }
    final private int rooms=20;
    private int roomCount=0;
    public void bookRoom() {
        // write your code here
        if(roomCount<rooms){
            roomCount+=1;
            System.out.println("Room "+roomCount+ " booked");
        }
        else{
            System.out.println("No rooms available");
        }
    }
}
