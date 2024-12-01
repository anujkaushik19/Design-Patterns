package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable observable;
    String username;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.username=username;
        this.observable=observable;
    }

    @Override
    public void update(){
        sendMessage(username,"message sent");
    }

    private void sendMessage(String username, String msg){
        System.out.println("message send to:" + username);
    }
}