//Create a program to swap two numbers.
import  java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number :");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number :");
        int num2 = input.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("----------After Swap--------------");
        System.out.println("The value of first number is :"+num1);
        System.out.println("The value of second number is :" +num2);
    }
}
