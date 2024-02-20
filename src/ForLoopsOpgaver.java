public class ForLoopsOpgaver {

    public static void main (String[] args) {

        // Opgave 1
        for (int i = 1; i <= 4; i++) {
            int result = 2 * i;
            System.out.println("2 gange " + i + " = " + result);
        }
        System.out.println("\n");

        // Opgave 2a: print 2 4 6 8 10 12
        for (int i = 1; i <= 6; i++) {
            int numberRow = i + i;
            System.out.print(numberRow + " ");
        }

        System.out.println("\n");


        for (int i = 2; i <= 12; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Opgave 2b: print 4 19 34 49 64 79
        for (int i = 4 ; i <= 80; i += 15) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Opgave 2c: print 30  20  10  0 -10  -20
        for (int i = 30 ; i >= -20; i -= 10) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Opgave 2d: print -7  -3  1  5  9  13
        for (int i = -7 ; i <= 13; i += 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Opgave 2d: print 97  94  91  88  85  82
        for (int i = 97 ; i >= 82; i -= 3) {
            System.out.print(i + " ");
        }
    }
}
