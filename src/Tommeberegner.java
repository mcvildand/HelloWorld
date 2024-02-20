import java.util.Scanner;

public class Tommeberegner {

    public static void main (String[] args) {

        System.out.println("Dette er en tommeberegner.\n" + "Indtast længde i tommer (brug komma): ");

        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();
        final double CENTIMETER_PER_TOMME = 2.54;
        double inchesToCentimeter = inches * CENTIMETER_PER_TOMME;

        System.out.println(inches + " tommer svarer til: \n" + inchesToCentimeter + " cm");

    }
}
