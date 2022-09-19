package exercises.Class01;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String quoteLower = quote.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your search term: ");
        String search = input.nextLine();
        String searchLower = search.toLowerCase();

//        Part 4
//        if (quoteLower.contains(searchLower)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        Part 5
        if (quoteLower.contains(searchLower)) {
            System.out.println("The index for '"+search+"' is: "+quoteLower.indexOf(searchLower));
            String quoteAltered = quote.replace(search, "");
            System.out.println(quoteAltered);
        } else {
            System.out.println("The search term '"+search+"' does not appear in the sentence.");
        }
    }
}
