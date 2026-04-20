
package p6_jihad;

/**
 *
 * @author Jihad'ainul Yaqin
 */
import java.util.Scanner;

public class LATIHAN {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan kondisi cuaca (hujan/panas/dingin): ");
        String cuaca = input.nextLine();
        
        if (cuaca.equalsIgnoreCase("hujan")) {
            System.out.println("Bawa Payunng");
        } else if (cuaca.equalsIgnoreCase("panas")) {
            System.out.println("pakai topi");
        } else if (cuaca.equalsIgnoreCase("dingin")) {
            System.out.println("pakai jaket");
        } else{
            System.out.println("pakai biasa saja");
        }
    }
}
