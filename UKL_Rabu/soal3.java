package UKL_Rabu;

import java.util.Scanner;
import java.lang.reflect.Array;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen array:");

        int length = in.nextInt();

        int[] bilangan = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = in.nextInt();
        }

        System.out.println("Berikut adalah array anda: " + java.util.Arrays.toString(bilangan));

        int num_mayoritas = bilangan[0];
        int jumlah_maks = 0;

        for (int i = 0; i < length; i++) {
            int jumlah = 0;
            for (int j = 0; j < length; j++) {
                if (bilangan[j] == bilangan[i]) {
                    jumlah++;
                }
            }
            if (jumlah > jumlah_maks) {
                num_mayoritas = bilangan[i];
                jumlah_maks = jumlah;
            }
        }
        System.out.println("Nilai mayoritas: " + num_mayoritas);
    }

    }

