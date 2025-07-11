package Collection;
import java.util.*;

public class PriorityQueueDemo {

    PriorityQueue<String> stringQueue;

    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        //don't use iterator which may or may not
        //show the PriorityQueue's order
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
