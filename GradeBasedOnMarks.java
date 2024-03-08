/*
Create a java program that calculates grades based on marks
A-> above 90%        B-> above 75%
C-> above 60%        D-> above 30%
F-. below 30%*/
import java.util.Scanner;
public class GradeBasedOnMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your marks :");
        int marks = input.nextInt();

        if(marks > 90){
            System.out.println("Grade A");
        } else if(marks>75){
            System.out.println("Grade B");
        } else if(marks > 60){
            System.out.println("Grade C");
        }
        else if(marks >= 30){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

    }
}
