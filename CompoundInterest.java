//Create a program to calculate Compound interest. Compound interest = P(1+R/100).
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Principle of the interest :");
        int principle = input.nextInt();
        System.out.print("Please enter the Time of the interest :");
        int time = input.nextInt();
        System.out.print("Please enter the Rate of the interest :");
        int rate = input.nextInt();

        int CompoundInterest = principle*(1 + rate / 100)*time;

        System.out.println("Total compound interest is :" + CompoundInterest);

    }
}
