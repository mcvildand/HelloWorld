import java.util.Random;
import java.util.Scanner;

public class Terningkast {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        Random rand = new Random();
        //int numberOne = rand.nextInt(6)+1;
        //int numberTwo = rand.nextInt(6)+1;

        int sum = 0;

        while (sum != 7) {
            //System.out.println("Indtast det første tal: ");
            //numberOne = input.nextInt();
            //System.out.println("Indtast det andet tal: ");
            //numberTwo = input.nextInt();
            //System.out.println("Den første terning slår: " + numberOne);
            //System.out.println("Den anden terning slår: " + numberTwo);
            int numberOne = rand.nextInt(6)+1;
            int numberTwo = rand.nextInt(6)+1;
            sum = numberOne + numberTwo;
            System.out.println(numberOne + " + " + numberTwo + " = " + sum);

        }
    }
}
