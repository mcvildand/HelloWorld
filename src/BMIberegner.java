import java.util.Scanner;
//import static java.lang.Math.pow;

public class BMIberegner {

    public static void main (String[] args) {

        // BMI = kg / (m * m)  vægt / (højde * højde)

        double height;
        double weight;

        Scanner input = new Scanner(System.in);

        System.out.println("Dette er en BMI-beregner.\n" + "Indtast din højde i meter: ");

        height = input.nextDouble();

        System.out.println("Indtast din vægt i kg:");

        weight = input.nextDouble();

        //double BMI = weight / (height * height);
        //double BMI = weight / pow(height, 2);
        double BMI = weight / Math.pow(height, 2); // skriv Math. og så foreslår den noget

        System.out.println("Din BMI er: " + BMI);

        ////////// OPGAVE 2 ///////////

        // < 18.5: Undervægtig
        // 18.5-25: normalvægtig
        // 25-30: overvægtig
        // > 30: svært overvægtig

        String text;
        if (BMI < 0) {
            text = "Indtastning ugyldig, prøv igen :)";
        } else if (BMI < 18.5) {
            text = "Din BMI angiver at du kan være undervægtig";
        } else if ((18.5 <= BMI) && (BMI < 25)) {
            text = "Din BMI angiver at du kan være normalvægtig";
        } else if ((25 <= BMI) && (BMI < 30)) {
            text = "Din BMI angiver at du kan være overvægtig";
        } else {
            text = "Din BMI angiver at du kan være svæert overvægtig";
        }

        System.out.println(text);
    }
}