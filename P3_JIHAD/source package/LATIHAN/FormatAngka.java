
import java.text.NumberFormat;

public class FormatAngka {
    public static void main (String args[]){
        double Angka=83243463.342245;
        double AngkaPecahan=0.902235643;

        NumberFormat NumberFormatter = NumberFormat.getNumberInstance();
        NumberFormat CurrFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat PercentFormatter =
NumberFormat.getPercentInstance();

        String NumberStr = NumberFormatter.format(Angka);
        String CurrStr = CurrFormatter.format(Angka);
        String PercenStr = PercentFormatter.format(AngkaPecahan);

        System.out.println("double Angka = "+ Angka +" berformat number : "+NumberStr);
        System.out.println("double Angka = "+ Angka +" berformat currency : "+CurrStr);
        System.out.println("double Angka = "+ AngkaPecahan +" berformat percent : "+PercenStr);
        System.out.println();
        System.out.println();

        NumberFormatter.setMinimumIntegerDigits(1);
        CurrFormatter.setMinimumIntegerDigits(1);
        PercentFormatter.setMinimumIntegerDigits(1);

        NumberFormatter.setMinimumFractionDigits(2);
        CurrFormatter.setMinimumFractionDigits(2);
        PercentFormatter.setMinimumFractionDigits(6);

        System.out.println("double Angka = "+ Angka +" berformat number :"+NumberFormatter.format(Angka));
        System.out.println("double Angka = "+ Angka +" berformat currency :"+CurrFormatter.format(Angka));
        System.out.println("double Angka = "+ AngkaPecahan +" berformat percent :"+PercentFormatter.format(AngkaPecahan));
        


    
    }
}
