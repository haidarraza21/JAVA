//Create a java program that determine yhe greatest of the three numbers.
import java.util.Scanner;
public class GreatestThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your first number :");
        float num1 = input.nextFloat();
        System.out.print("Please enter your second number :");
        float num2 = input.nextFloat();
        System.out.print("Please enter your third number :");
        float num3 = input.nextFloat();

        if(num1 > num2 && num1 > num3){
            System.out.println("The  greatest number is " +num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is " + num2);
        } else {
            System.out.println("The greatest number is " + num3);
        }


    }
}
