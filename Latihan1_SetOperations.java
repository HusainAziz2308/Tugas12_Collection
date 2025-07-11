package Collection;

import java.util.*;

public class Latihan1_SetOperations {
    public static void main(String[] args) {
        Set<Integer> A = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> B = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // A - B
        Set<Integer> diff = new TreeSet<>(A);
        diff.removeAll(B);
        System.out.println("A - B: " + diff);

        // A ∩ B
        Set<Integer> intersect = new TreeSet<>(A);
        intersect.retainAll(B);
        System.out.println("A ∩ B: " + intersect);

        // A ∪ B
        Set<Integer> union = new TreeSet<>(A);
        union.addAll(B);
        System.out.println("A ∪ B: " + union);

        // A ⊕ B
        Set<Integer> symDiff = new TreeSet<>(union);
        symDiff.removeAll(intersect);
        System.out.println("A ⊕ B: " + symDiff);
    }
}
