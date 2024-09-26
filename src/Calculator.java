public class Calculator {


    /**
     * java doc kommentar
     *
     * @param args programm argumente
     */
    public static void main(String[] args) {

        // Ich bin ein Kommentar
        // Ich bin zweites

        /*
        Hier können
        mehrere Zeilen
        von Kommentaren stehen
         */
        String name = "MyCalculator";
        int a = 3;
        int b = 2;
        int result;

        result = a + b;

        System.out.println("Mein Name: " + name);
        System.out.println("result = " + result);

        // berechnung direkt sout
        System.out.println(a + b);

        double c = 4.5;
        double g = 5.6;

        print(c,g);

    }

    public static double add(double a, double b) {
        return a+b;
    }
    public static double sub(double a, double b) {
        return a-b;
    }
    public static double mul(double a, double b) {
        return a*b;
    }
    public static double div(double a, double b) {
        return a/b;
    }
    public static double mod(double a, double b) {
        return a%b;
    }
    public static void print(double a, double b){
        System.out.println(add(a,b));;
        System.out.println(sub(a,b));;
        System.out.println(mul(a,b));;
        System.out.println(div(a,b));;
        System.out.println(mod(a,b));;
    }

}
