public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] Monatsnamen = {"Jänner", "Februar","März",
                "April","Mai","Juni","Juli",
                "August","September", "Oktober",
                "Novemeber","Dezember"};

        for (int i = 0; i < Monatsnamen.length; i++){
            System.out.println(Monatsnamen[i]+" ["+(i+1)+"]");
        }
    }
}
