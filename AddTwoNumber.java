//Create a program to add two number
import java.util.Scanner;
public class AddTwoNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.print("Please enter your first number :");
         int num1 = input.nextInt();
         System.out.print("Please enter your Second number :");
         int num2 = input.nextInt();
         int add = num1+num2;
         System.out.println("The sum of these numbers are :" + add);
     }


}
