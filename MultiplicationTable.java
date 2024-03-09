//Develop a java program that prints the multiplication table for a given number.
import java.util.Scanner;
public class MultiplicationTable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your number: ");
         int num = input.nextInt();
         multiplicationNumber(num);


     }
     public static void multiplicationNumber(int num){
         int i = 1 ;
         while (i<=10){
             System.out.println(num + " * " + i + " = " + i*num);
             i ++;
         }
     }
}
