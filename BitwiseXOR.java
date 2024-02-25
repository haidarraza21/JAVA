//Create a program that shows bitwise XOR of two numbers.
import java.util.Scanner;
public class BitwiseXOR {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the first number :");
   int num1 = input.nextInt();
   System.out.print("Please enter the second number :");
   int num2 = input.nextInt();

   int bitwiseXOR = num1 ^ num2 ;
   System.out.println("The value of these number is :" +bitwiseXOR);
  }
}
