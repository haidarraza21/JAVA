
//Create a program tto check if a given number is even or odd using bitwise operators.
import java.util.Scanner;

public class EvenOddByBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("your number is Odd! :");
        } else {
            System.out.println("Your number is Even!");
        }
    }
}
