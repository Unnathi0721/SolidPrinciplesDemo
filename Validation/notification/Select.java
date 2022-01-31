package Validation.notification;

public class Select{
    public Message choose(int k){
        if(k==1){
            return new Mobile();
        }
        else{
            return new Email();
        }
    }
}
