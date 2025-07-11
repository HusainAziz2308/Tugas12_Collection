package Collection;

import java.util.*;

public class Latihan2_ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
            Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo")
        );

        // Tampilkan data
        System.out.println("Tampilkan data  : " + list);

        // Balik data
        List<String> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        System.out.println("Balik data      : " + reversed);

        // Acak data
        List<String> shuffled = new ArrayList<>(list);
        Collections.shuffle(shuffled);
        System.out.println("Acak data       : " + shuffled);

        // Urutkan data
        List<String> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        System.out.println("Urutkan data    : " + sorted);
    }
}
