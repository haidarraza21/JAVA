//Create a program that determines if a given year is leap year(considering condition like divisible by 4 but not 100, unless als
// o divisible by 400.
import  java.util.Scanner;
public class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter the year :");
         int year = input.nextInt();

         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.println("This year is Leap Year!");

         } else {
             System.out.println("This year is not Leap Year");
         }
     }
}
