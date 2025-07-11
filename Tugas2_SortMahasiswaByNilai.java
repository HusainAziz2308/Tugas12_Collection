package Collection;
import java.util.*;

public class Tugas2_SortMahasiswaByNilai {
    static class Mahasiswa {
        String nrp;
        String nama;
        double nilai;

        Mahasiswa(String nrp, String nama, double nilai) {
            this.nrp = nrp;
            this.nama = nama;
            this.nilai = nilai;
        }

        public String toString() {
            return nrp + "-" + nama + " : " + String.format("%.2f", nilai);
        }
    }

    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();
        Random rand = new Random();

        // Tambah 10 data mahasiswa dengan nilai acak 60-100
        for (int i = 1; i <= 10; i++) {
            int kode = rand.nextInt(50) + 1;
            String nrp = "41240" + String.format("%02d", kode);
            double score = 60 + rand.nextDouble() * 40;
            list.add(new Mahasiswa(nrp, "Mahasiswa" + i, score));
        }

        // Urutkan berdasarkan nilai
        list.sort(Comparator.comparingDouble(m -> m.nilai));

        System.out.println("Mahasiswa terurut berdasarkan nilai:");
        list.forEach(System.out::println);
    }
}
