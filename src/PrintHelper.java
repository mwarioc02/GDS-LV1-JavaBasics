public class PrintHelper {

    public static void main(String[] args) {


        System.out.println("Mein Name lautet: Susi Sorglos");
        System.out.println("Mein Name lautet: Peter Sorglos");
        System.out.println("Mein Name lautet: Maria Sorglos");

        printName("Max Mustermann");
        printName("Susi Sorglos");
        printName("John Doe");

        String myName = "Karl Kaiser";
        printName(myName);  // printName("Karl Kaiser")

    }


    public static void printName(String name) {
        System.out.println("Mein Name lautet: " + name);
    }

    public static void printNumber(int number) {
        System.out.println("number = " + number);
    }
}
