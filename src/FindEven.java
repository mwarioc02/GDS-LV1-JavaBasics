public class FindEven {
    public static void main(String[] args) {
        int input = 1000000000;
        int i = 1;
        while (i < input && i > 0){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
