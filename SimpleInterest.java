//Create a program to calculate simple interest. Simple interest = (P * T * R)/100.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Principle of the interest :");
        int principle = input.nextInt();
        System.out.print("Please enter the Time of the interest :");
        int time = input.nextInt();
        System.out.print("Please enter the Rate of the interest :");
        int rate = input.nextInt();

        int SimpleInterest = (principle * time * rate)/100;

        System.out.println("Total simple interest is :" + SimpleInterest);


    }
}
