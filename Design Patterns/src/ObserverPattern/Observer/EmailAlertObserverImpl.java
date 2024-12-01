package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    
     StocksObservable observable;
     String emailId;

    public EmailAlertObserverImpl(String emailId,StocksObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendMail(emailId,"Email has been send");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
    }

}