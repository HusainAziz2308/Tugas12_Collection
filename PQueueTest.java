package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(10,
                new Comparator<Integer>() {
            public int compare(Integer int1, Integer int2) {
                boolean flag1 = isPrime(int1);
                boolean flag2 = isPrime(int2);
                if (flag1 == flag2) {
                    return int1.compareTo(int2);
                } else if (flag1) {
                    return -1;
                } else if (flag2) {
                    return 1;
                }
                return 0;
            }
        });
        
        pQueue.add(1);
        pQueue.add(5);
        pQueue.add(6);
        pQueue.add(4);
        pQueue.add(2);
        pQueue.add(9);
        pQueue.add(7);
        pQueue.add(8);
        pQueue.add(10);
        pQueue.add(3);
        while (true) {
            Integer head = pQueue.poll();
            if (head == null) {
                break;
            }
            System.out.print(head + " <-- ");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        long m = (long) Math.sqrt(n);
        for (long i = 3; i <= m; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
