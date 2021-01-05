package OOP;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    public List<Subscriber> subscribers = new ArrayList<>();
    Subscriber subscriber;
    String message;

    void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void send(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receive(message);
        }
    }
}
