public class Tagesabschnitt {
    public static void main(String[] args) {
        int time = 21;
        String timeOfDay;

        if (time >= 6 && time <= 9)
            timeOfDay = "Früh";
        else if (time > 9 && time <= 12)
            timeOfDay = "Vormittag";
        else if (time > 12 && time <= 16)
            timeOfDay = "Nachmittag";
        else if (time > 16 && time <= 20)
            timeOfDay = "Abend";
        else
            timeOfDay = "Nacht";

        System.out.println("Es ist " + timeOfDay);

        test();
    }

    public static void test() {
        //do something
        int a = 1;

        if (a == 1) {
            a++;
            return;
        }

        if (a == 2){
            //do something

        }
        else if (a == 3){
            // do something more
        }
    }
}
