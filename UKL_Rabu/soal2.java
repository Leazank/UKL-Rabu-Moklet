package UKL_Rabu;

public class soal2 {

    static int ngitungTabungan(int tabunganBulanPertama){
        int totalTabungan = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Bulan ke-" + i + " : " + tabunganBulanPertama);
            totalTabungan += tabunganBulanPertama;
            tabunganBulanPertama += 50000;
        }
        return totalTabungan;
    }
    public static void main(String[] args) {
        int tabunganBulanan = 500000;
        // int totalTabungan = 0;

        // for (int i = 1; i <= 12; i++) {
        //     System.out.println("Bulan ke-" + i + " : " + tabunganBulanan);
        //     totalTabungan += tabunganBulanan;
        //     tabunganBulanan += 50000;
        // }


        System.out.print("Total tabungan setelah 12 bulan: " + ngitungTabungan(tabunganBulanan));
    }
}
