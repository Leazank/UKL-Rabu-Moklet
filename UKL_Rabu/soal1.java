package UKL_Rabu;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan total belanja: ");
        double totalBelanja = in.nextDouble();

        if (totalBelanja  < 200000 & totalBelanja > 100000) {
            System.out.println("Anda mendapatkan diskon sebesar 10%");
            System.out.print("Harga yang harus anda bayar adalah: " + (totalBelanja * 0.9) + " Rupiah");
        } else if (totalBelanja > 200000) {
            System.out.println("Anda mendapatkan diskon sebesar 20%");
            System.out.print("Harga yang harus anda bayar adalah: " + (totalBelanja * 0.8) + " Rupiah");
        } else {
            System.out.print("Harga yang harus and bayar adalah: " + totalBelanja + " Rupiah");
        }
    }
}

