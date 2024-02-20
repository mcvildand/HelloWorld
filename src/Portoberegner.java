import java.util.Scanner;

public class Portoberegner {

    public static void main(String[] args) {

        // Brev op til 2.000g = 75kr i Danmark

        double weight;
        int price = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Dette er en portoberegner.\n" + "Indtast brevets vægt i gram: ");

        weight = input.nextDouble();

        String text;
        if (weight <=0 || weight > 2000) {
            text = "Et brev med denne vægt kan vi ikke sende";
        } else if (weight <= 100) {
            price = 25;
        } else if (weight <= 250) {
            price = 50;
        } else {
            price = 75;
        }

        text = "Prisen på forsendelsen er: " + price + " kr";

        System.out.println(text);


        /*
        String text;
        if (weight <=0 || weight > 2000) {
            text = "Et brev med denne vægt kan vi ikke sende";
        } else if (weight <= 100) {
            price = 25;
            text = "Prisen på forsendelsen er: " + price + " kr";
        } else if (weight <= 250) {
            price = 50;
            text = "Prisen på forsendelsen er: " + price + " kr";
        } else {
            price = 75;
            text = "Prisen på forsendelsen er: " + price + " kr";
        }
        */


        // hvad sker der med price hvis man ville bruge den efter? Hvordan gemmes den?
        //System.out.println("Test af price variabel: " + price);

    }
}


