//Create a program that takes two numbers and shows result of all arithmetic operator(+,-,*,/,%).
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please Enter your first number :");
        int num1 = input.nextInt();
        System.out.print("Please Enter your second number :");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("The sum of these number is :" + add);
        System.out.println("The subtract of these number is :" + subtract);
        System.out.println("The multiply of these number is :" + multiply);
        System.out.println("The divide of these number is :" + divide);
        System.out.println("The modulus of these number is :" + modulus);

    }
}
