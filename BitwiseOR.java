//Create a program that shows bitwise OR of two numbers.
import java.util.Scanner;
public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number :");
        int num2 = input.nextInt();

        int bitwiseOR = num1 | num2;
        System.out.println("The value of these number is :" +bitwiseOR);

    }
}
