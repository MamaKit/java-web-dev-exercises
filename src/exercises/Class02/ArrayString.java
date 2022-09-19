package exercises.Class02;

import java.util.Arrays;

public class ArrayString {
    public static void main (String[] args) {
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";
//        String[] quoteArr = quote.split(" ");
        String[] quoteArr = quote.split("\\.");
        System.out.println(Arrays.toString(quoteArr));
    }
}
