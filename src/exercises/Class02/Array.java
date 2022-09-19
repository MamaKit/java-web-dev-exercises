package exercises.Class02;

public class Array {
    public static void main (String[] args) {
        int[] practice = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < practice.length; i++) {
//            System.out.println(practice[i]);
            if (practice[i]%2 != 0) {
                System.out.println(practice[i]);
            }
        }
    }
}
