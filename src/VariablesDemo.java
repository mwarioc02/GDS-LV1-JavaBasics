public class VariablesDemo {

    public static void main(String[] args) {

        // Deklaration
        int a;

        // Initialisieren
        a = 100;
        System.out.println(a);

        // Deklaration + Initialisierung
        long z = 200;
        long y;

        y = a; // y: erwarteter Wert = 100

        // long to int nicht möglich
        //int b = y;


        // Deklaration
        int c;
        int e,f,g;
        String name;

        // initialisieren
        c = 2;
        e = 3;
        f = 4;
        g = 5;
        name = "Maxi Mustermann";

        System.out.println(e);
        System.out.println("c = " + c);

        // soutv => automatische Ausgabe von Variablen
        System.out.println("f = " + f);


        int j;
        // immer vorher initialisieren
        //System.out.println("j = " + j); => Fehler
        j = 5;
        System.out.println("j = " + j);
    }
}
