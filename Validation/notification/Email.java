package Validation.notification;

class Email extends Message implements Notification{
    @Override
    public void sendEventDetails(){
        //logic
        System.out.println("Details via Mail:"+msg);
    }
}
