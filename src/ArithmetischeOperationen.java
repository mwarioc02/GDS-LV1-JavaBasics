public class ArithmetischeOperationen {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int result;

        // Addition
        result = a + b;
        System.out.println("Addition: " + result);

        // Subtrahieren
        result = a - b;
        System.out.println("Subtrahieren: " + result);

        // Multiplikation -> direkt Ausgabe
        System.out.println("Mulitplikation: " + (a * b));

        double divResult = a / (b * 1.0);
        System.out.println("Division: " + divResult);

        // STRG + D => Zeile duplizieren
        // STRG + Y => Zeile löschen

        // Division durch 0 nicht möglich
        // System.out.println("Division durch 0: " + (3 / 0));


    }
}
