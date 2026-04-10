import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine(); // Membaca input teks
        
        System.out.println("Halo, " + nama + "!");
        
        input.close(); // Menutup scanner agar tidak memory leak
    }
}
