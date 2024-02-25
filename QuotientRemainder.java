//Create a program to compute Quotient and Remainder
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend");
        float dividend = input.nextFloat();
        System.out.println("Enter the divisor");
        float divisor = input.nextFloat();
        float quotient = dividend / divisor;
        float remainder = dividend % divisor;

        System.out.println("Quotient is: "+ quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
