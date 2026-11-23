
import java.util.ArrayList;

public class ThreadSafeList {

    private final ArrayList<String> list = new ArrayList<>();

    // Add an element to the list
    public synchronized void add(String element) {
        list.add(element);
    }

    // Get the size of the list
    public synchronized int size() {
        return list.size();
    }

    // Remove an element from the list
    public synchronized boolean remove(String element) {
        return list.remove(element);
    }
}
