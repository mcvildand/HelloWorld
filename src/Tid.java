public class Tid {

    public static void main (String[] args) {

        int seconds = 00;
        int minutes = 13;
        int hours = 11;

        System.out.println("Sekunder: " + seconds);
        System.out.println("Minutter: " + minutes);
        System.out.println("Timer: " + hours);

        // Opgave 4 - sekunder siden midnat
        int secondsSinceMidnight = (hours * 60 * 60) + (minutes * 60) + (seconds);

        System.out.println("Siden midnat er der gået: " + secondsSinceMidnight + " sekunder");

        // Opgave 5 sekunder til næste midnat
        int SecondsInOneDay = 24 * 60 * 60; //Result: 86400
        int secondsUntilMidnight = SecondsInOneDay - secondsSinceMidnight;

        System.out.println("Sekunder tilbage i dag: " + secondsUntilMidnight);

        // Opgave 6 + 7 - sekunder opgaven har taget
        int secondsNow = 00;
        int minutesNow = 34;
        int hoursNow = 11;

        int secondsSinceMidnightNow = (hoursNow * 60 * 60) + (minutesNow * 60) + (secondsNow);

        System.out.println("Siden midnat er der NU gået: " + secondsSinceMidnightNow + " sekunder");

        int exerciseTimeSeconds = secondsSinceMidnightNow - secondsSinceMidnight;
        int exerciseTimeMinutes = exerciseTimeSeconds / 60;

        System.out.println("Opgaven har taget " + exerciseTimeSeconds + " sekunder at lave");
        System.out.println("Opgaven har taget " + exerciseTimeMinutes + " minutter at lave");



    }
}
