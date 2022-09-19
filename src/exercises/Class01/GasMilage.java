package exercises.Class01;

import java.util.Scanner;

public class GasMilage {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles traveled: ");
        int miles = input.nextInt();
        System.out.println("Please enter the gas used (in gallons): ");
        int gas = input.nextInt();
        int mpg = miles / gas;
        System.out.println("Your average miles-per-gallon was: "+mpg);
    }
}
