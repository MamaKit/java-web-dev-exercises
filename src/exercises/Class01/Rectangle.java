package exercises.Class01;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        int length = input.nextInt();
        System.out.println("Please enter the width: ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of a rectangle with length "+length+" and width "+width+" is: "+area+".");
    }
}
