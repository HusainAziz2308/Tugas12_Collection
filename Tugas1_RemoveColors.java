package Collection;

import java.util.*;

public class Tugas1_RemoveColors {
    public static void main(String[] args) {
        List<String> warna = new ArrayList<>(
            Arrays.asList("MAGENTA", "RED", "WHITE", "BLUE", "CYAN")
        );
        List<String> warnaDihapus = new ArrayList<>(
            Arrays.asList("RED", "WHITE", "BLUE")
        );

        warna.removeAll(warnaDihapus);
        System.out.println("Warna setelah dihapus: " + warna);
    }
}