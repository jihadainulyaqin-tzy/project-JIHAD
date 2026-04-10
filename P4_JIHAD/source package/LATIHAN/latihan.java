
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas, uts, uas;
        float realisasi, kehadiran;

        System.out.print("input Realisasi: ");
        realisasi = input.nextFloat();

        System.out.print("input keseharian: ");
        kehadiran = input.nextInt();
        System.out.print("Tugas: ");
        tugas = input.nextInt();
        System.out.print("UTS: ");
        uts = input.nextInt();
        System.out.print("UAS: ");
        uas = input.nextInt();

        float b_kehadiran, b_tugas, b_uts, b_uas, total;

        b_kehadiran = kehadiran / realisasi *10;

        b_tugas = tugas * 20 / 100;
        b_uts = uts * 30 / 100;
        b_uas = uas * 40 / 100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.print("Kehadiran: " + kehadiran + " Dari Realisasi: "+ realisasi);
        System.out.print("Nilai Tugas: " + tugas);
        System.out.print("Nilai UTS: " + uts);
        System.out.print("Nilai UAS " + uas);
        System.out.print("Total: " + total);
    }
}
