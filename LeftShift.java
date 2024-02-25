//Create a program that shows use of left shift operator.
import java.util.Scanner;
public class LeftShift {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the number :");
   int num = input.nextInt();

   int leftShift = num << 1;
   System.out.println("The value of this number is :" +leftShift);
  }
}
