import java.util.Scanner;
public class Pemilihan2Percobaan215 {
    public static void main (String [] args){
        Scanner input05 = new Scanner (System.in);

        float totalSudut;

        System.out.print("Sudut 1 : ");
        float sudut1 = input05.nextFloat();
        System.out.print("Sudut 2 : ");
        float sudut2 = input05.nextFloat();
        System.out.print("Sudut 3 : ");
        float sudut3 = input05.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("Total " + totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 ==90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if  ((sudut1 > 90) || (sudut2 > 90) || (sudut3 > 90))
            System.out.println("Segitiga tersebut adalah segitiga lancip");
        } else
           System.out.println("Bukan Segitiga");

           input05.close();
    }
    
}
