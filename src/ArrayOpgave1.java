public class ArrayOpgave1 {

    public static void main(String[] args) {

        int[] arr = new int[8];
        //arr[7] = 117;
        arr[arr.length-1] = 117;
        //System.out.println(arr[0]);
        System.out.println(arr[7]);
        //System.out.println(test);

        // Opgave 3
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        // Opgave 4
        String[] arrString = {"Hej", "med", "dig"};

        // Opgave 5
        for (String item : arrString) {
            System.out.print(item + " ");
        }

        System.out.println("\n");

        // Opgave 6 - udskriv indexplads 2, udskriv længden
        double[] arrDouble = {3.4, 2.5, 1.2, 6.7};

        System.out.print(arrDouble[2] + " ");

        System.out.println("\n");

        // Print array længde 1
        System.out.println("Metode 1: Længden af arrayet er: " + arrDouble.length);

        // Print array længde 2
        int i = 1;
        for (String item : arrString) {
            i = i + 1;
        }
        System.out.println("Metode 2: Længden af arrayet er: " + i);

        // Udskriv værdien på index 4 -> fejlmeddelelse
        //System.out.print(arrDouble[4] + " "); laver exception

        int a =  58 / 60;
        int b = 58 % 60;
        System.out.println("divider " + a);
        System.out.println("modulus " + b);

    }
}


