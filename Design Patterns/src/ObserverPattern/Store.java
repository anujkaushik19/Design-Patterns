package ObserverPattern;

import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observer.*;

public class Store {
    public static void main(String args[]) {

        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("anuj@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("kaushik@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("anujkaushik", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
        iphoneStocksObservable.setStockCount(100);

    }
}