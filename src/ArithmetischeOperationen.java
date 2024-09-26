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


        // Unäre Operatoren

        int j = 3;
        System.out.println();
        System.out.println("j = " + j);
        System.out.println("j = " + j++); // Erwartung: 3
        System.out.println("j = " + j); // Erwartung: 4

        // j = 4 -> an dieser Stelle
        System.out.println("j = " + (++j)); // Erwartung: 5


        // a++ => kurzschreibweise für a = a + 1
        a += 1; // a = a + 1


    }
}
