package Validation.notification;

class Mobile extends Message implements Notification{
    @Override
    public void sendEventDetails(){
        //logic
        System.out.println("Details via Mobile:"+ msg);
    }
}
