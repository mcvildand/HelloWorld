import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sentinel = -1;
        int number = 0;
        int sum = 0;

        System.out.println("Programmet stoppes ved at taste -1");

        while (number != sentinel) {
            sum += number;
            System.out.println("Indtast det tal der skal lægges sammen");
            number = input.nextInt();
        }

        System.out.println("Summen af tallene er: " + sum);
    }

}



//if (number != sentinel) {
//sum += number;
//}