public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array1 = {3,4,5};
        int[] array2 = {7,1,3};

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i] + array2[i]);
            System.out.println(array1[i] * array2[i]);
        }
    }
}
