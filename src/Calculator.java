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

        print(add(c,g),
                sub(c,g),
                mul(c,g),
                div(c,g),
                mod(c,g));

        int[] arr = {1,2,3,4};
        sum(arr);
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
    public static void print(double add, double sub, double mul, double div, double mod){
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum "+ sum);
    }

}
