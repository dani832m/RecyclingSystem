import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("VELKOMMEN TIL PANTAUTOMATEN!");

        List<Can> totalPantList = new ArrayList<Can>();

        Scanner input = new Scanner(System.in);

        System.out.println("INDTAST A, B ELLER C OG TRYK ENTER. SKRIV \"SLUT\" NÅR DU ER FÆRDIG.\n");

        String panttype = "";
        double converter = 0.0; //Bruges til at omregne panttypen til kroner
        int pantAcount = 0; //Angiver samlet antal af enheder med A-pant
        int pantBcount = 0; //Angiver samlet antal af enheder med B-pant
        int pantCcount = 0; //Angiver samlet antal af enheder med C-pant
        double totalPantValue = 0.0; //Angiver værdien for det samlede beløb af flasker

        while(!panttype.equalsIgnoreCase("SLUT")) {
            System.out.print("Deposit: ");
            panttype = input.next();

            if (panttype.equalsIgnoreCase("A") || panttype.equalsIgnoreCase("B") || panttype.equalsIgnoreCase("C")) {

                if (!panttype.equalsIgnoreCase("SLUT")) {
                    totalPantList.add(new Can(panttype));

                    if (panttype.equalsIgnoreCase("A")) {
                        converter = 1.0;
                        pantAcount++;

                    } else if (panttype.equalsIgnoreCase("B")) {
                        converter = 1.5;
                        pantBcount++;

                    } else if (panttype.equalsIgnoreCase("C")) {
                        converter = 3.0;
                        pantCcount++;
                    }

                    totalPantValue += converter;

                    System.out.println("Dåse tilføjet til kvittering.\n");
                }

            } else
                System.out.println("Du skal indtaste A, B eller C! Prøv igen.\n");
        }

        System.out.println("\nDu har afsluttet transaktionen, og maskinen har nu registreret alle dine dåser.\n");

        System.out.println("Dåser med værdi:");
        System.out.println("Antal A pant leveret: " + pantAcount + " enheder.");
        System.out.println("Antal B pant leveret: " + pantBcount + " enheder.");
        System.out.println("Antal C pant leveret: " + pantCcount + " enheder.");
        
        System.out.println("\nDu har samlet leveret flasker for: " + totalPantValue + " kroner.");
        System.out.println("\nTak fordi du anvendte automaten!");
    }
}
