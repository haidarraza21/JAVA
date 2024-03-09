// Create a java program that determines if a number is positive, negative pr zero.
import java.util.Scanner;
public class NumberIsPositiveNegativeOrZero {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.print("Please enter your number :");
         int number = input.nextInt();

         if(number > 0){
             System.out.println("Number is Positive!");
         } else if (number == 0) {
             System.out.println("Number is Zero!");
         } else {
             System.out.println("Number is Negative");
         }
     }
}
