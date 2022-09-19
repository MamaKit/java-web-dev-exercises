package exercises.Class02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListString {
    public static void main (String[] args) {
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String quote1 = quote.replace(",","");
        String quote2 = quote1.replace(".","");
        List<String> quoteArrList = new ArrayList<>(Arrays.asList(quote2.split(" ")));
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of characters to search: ");
        int search = input.nextInt();
//        int search = 5;
//        System.out.println(quoteArrList);
        for (String word : quoteArrList) {
            if (word.length() == search) {
                System.out.println(word);
            }
        }
    }
}
