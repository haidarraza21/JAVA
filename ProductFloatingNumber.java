//Create a program to calculate product of two floating points numbers.
import java.util.Scanner;
public class ProductFloatingNumber {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your first number :");
        float num1 = input.nextFloat();
        System.out.print("Please enter your second number: ");
        float num2 = input.nextFloat();
        float product = num1 * num2;
        System.out.println("The products of these two floating points numbers is :" + product);
    }
}
