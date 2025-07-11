package Collection;

import java.util.*;

public class Latihan3_MahasiswaList {
    static class Mahasiswa implements Comparable<Mahasiswa> {
        String nrp;
        String nama;

        Mahasiswa(String nrp, String nama) {
            this.nrp = nrp;
            this.nama = nama;
        }

        public int compareTo(Mahasiswa o) {
            return this.nama.compareTo(o.nama);
        }

        public String toString() {
            return nrp + "-" + nama;
        }
    }

    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();
        list.add(new Mahasiswa("001", "Citra"));
        list.add(new Mahasiswa("002", "Budi"));
        list.add(new Mahasiswa("003", "Andi"));
        list.add(new Mahasiswa("004", "Dewi"));

        // Tampilkan data
        System.out.println("Original        : " + list);

        // Balik
        List<Mahasiswa> rev = new ArrayList<>(list);
        Collections.reverse(rev);
        System.out.println("Reversed        : " + rev);

        // Acak
        List<Mahasiswa> shuf = new ArrayList<>(list);
        Collections.shuffle(shuf);
        System.out.println("Shuffled        : " + shuf);

        // Urutkan berdasarkan nama
        List<Mahasiswa> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        System.out.println("Sorted by nama  : " + sorted);
    }
}
