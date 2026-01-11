import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please enter your first number:    ");
        int num1 = input.nextInt();
        
        System.out.println("Now enter the second number :    ");
        int num2 = input.nextInt();
    
    int greaterNumber = num1 > num2 ? num1 : num2;

    System.out.println(greaterNumber + " is the greatest number");

    }
}
