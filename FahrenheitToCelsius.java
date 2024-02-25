//Create a program to convert Fahrenheit to Celsius. C=(F-32)*5/9.
import java.util.Scanner;
public class FahrenheitToCelsius {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter the fahrenheit :");
         float fahrenheit = input.nextFloat();

         float celsius = (fahrenheit - 32)*5/9;

         System.out.println("Here are celsius of the fahrenheit :" + celsius);
     }
}
