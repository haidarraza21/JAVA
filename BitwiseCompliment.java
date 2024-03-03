//Create a java program that shows bitwise compliment of a number.
import java.util.Scanner;
public class BitwiseCompliment {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the first number :");
   int a = input.nextInt();

   int bitwiseCompliment= ~a ;
   System.out.println("The bitwise Compliment is " + bitwiseCompliment);
  }
}
