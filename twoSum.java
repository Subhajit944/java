import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Odd & Even Calculator \n");

        System.out.print("Enter your First number");
        int firstNum = input.nextInt();
        System.out.print("Enter your Second number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is :  " + sum);


    }
}
