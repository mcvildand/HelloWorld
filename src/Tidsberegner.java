//import java.util.Scanner;

import java.util.Scanner;

public class Tidsberegner {

    public static void main (String[] args) {

        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        Scanner input = new Scanner(System.in);

        // Timer
        System.out.println("Hvor mange hele timer er der gået?");
        hours = input.nextInt();
        //System.out.println("Der er gået " + hours + " timer");

        // Minutter
        System.out.println("Hvor mange hele minutter er der gået?");
        minutes = input.nextInt();
        //System.out.println("Der er gået " + minutes + " minutter");

        // Sekunder
        System.out.println("Hvor mange hele sekunder er der gået?");
        seconds = input.nextInt();
        //System.out.println("Der er gået " + seconds + " timer");

        // Udregner sekundet siden midnat
        int secondsSinceMidnightUserInput = (hours * 60 * 60) + (minutes * 60) + (seconds);

        // Printer svaret
        // Ved input: 11 timer, 13 minutter og 0 sekunder = 40380
        System.out.println("Siden midnat er der gået: " + secondsSinceMidnightUserInput + " sekunder");


    }
}
