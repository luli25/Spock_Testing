package OOP;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    public List<Subscriber> subscribers = new ArrayList<>();
    Subscriber subscriber;
    String message;

    public void send(String message) {
    }
}
