public class DemoIntegerDivision {

    public static void main (String[] args) {

        int enTredje = 1/3;

        // sout shortcut
        System.out.println(enTredje);

        double enTrejdeDouble = 1.0/3.0; // virker så længe den ene af dem er en double(med decimal)
        System.out.println(enTrejdeDouble);

        double enTrejdeNy = (double)1/3; // konveterer int til double
        System.out.println(enTrejdeNy);

        double enTrejde3 = 1d/3; // konveterer int til double
        System.out.println("test " + enTrejde3);

        int tal = 4;
        double nytTal = tal;
        System.out.println(nytTal);

        double tal2 = 4.5;
        int nytTal2 = (int)tal2; // foreslår: (int) tal2 hvis man skriver tal2 bare; - kaldes typecast
        System.out.println(nytTal2);
    }
}
