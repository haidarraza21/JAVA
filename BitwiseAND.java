//Create a java program that shows bitwise AND of two numbers
import java.util.Scanner;
public class BitwiseAND {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Please enter the first number :");
  int num1 = input.nextInt();
  System.out.print("Please enter the second number :");
  int num2 = input.nextInt();

  int result = num1 & num2;

  System.out.println("The bitwise AND of these numbers is :" + result);

 }
}
