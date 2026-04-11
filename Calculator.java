package Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Division Calculator...\n");
    System.out.println("Please enter your two numbers:   ");
    int first = input.nextInt();
    int second = input.nextInt();

    try{
    int result = first / second;
    System.out.printf( "Result is %d " , result );
    } catch(ArithmeticException exception){
        System.out.println("Divide by zero enter valid values");
    }
    }
}
