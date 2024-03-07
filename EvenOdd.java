//Create a Java program that determines if a number is odd or even.
import java.util.Scanner;
public class EvenOdd {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.print("Please enter your number :");
         int number = input.nextInt();

         if(number % 2 == 0){
             System.out.println("Number is Even!");
         } else {
             System.out.println("Number is Odd!");
         }
     }
}
