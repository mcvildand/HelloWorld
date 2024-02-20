import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        //// Opgave 7 - random number ///
        //Random rand = new Random();
        //int numberToGuess = rand.nextInt(10)+1;
        int numberToGuess = 5;
        int usersGuess = -1;

        //System.out.println("Indtast et til mellem 1 og 10");

        ////// Opgave 5 + 8//////
        int i = 0;
        do {
            System.out.println("Indtast et til mellem 1 og 10");
            usersGuess = input.nextInt();
            if (usersGuess > numberToGuess) {
                System.out.println("Forkert! Tallet jeg tænker på er mindre. Prøv igen:");
            } else if (usersGuess < numberToGuess){
                System.out.println("Forkert! Tallet jeg tænker på er større. Prøv igen:");
            }
            i++;
        }
        while (numberToGuess != usersGuess);
            System.out.println("Rigtigt! Det tal jeg tænkte på var " + numberToGuess);
            System.out.println("Du har brugt " + i + " gæt");

       /*
        while(...) {
            ...

            if (usersGuess == numberToGuess) {
                System.out.println("");
            }
        }

        */
    }
}
