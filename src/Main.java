import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- VELKOMMEN TIL PANTAUTOMATEN ----------");

        List<Can> totalPant = new ArrayList<Can>();

        Scanner input = new Scanner(System.in);

        System.out.println("--- INDTAST STORT A, B ELLER C OG TRYK ENTER. ---\n");

        while(true) {
            System.out.print("Deposit: ");
            String panttype = input.next();
            totalPant.add(new Can(""));
            System.out.println("Dåse tilføjet til kvittering.\n");
        }

        //System.out.println("Maskinen har nu registreret alle dine dåser.");


        /* Printer værdier for Can-objekter (til debugging)
        System.out.println(can1);
        System.out.println(can2);
        */
        
    }
}
