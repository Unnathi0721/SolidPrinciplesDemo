package Validation.notification;

public class Message implements Notification{
    public String msg;
    public void sendEventDetails(){
        //logic
        System.out.println("Details:");
    }
    public void createMsg(String msg){
        this.msg=msg;
    }
}
