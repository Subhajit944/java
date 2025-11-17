import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong numbers ");
        System.out.print("Please enter your number :   ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");

        }else{
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        System.out.println("No of Digots:   " + noOfDigits);
        int finalNumber = 0;

        while (num > 0){
            int lastDigits = num % 10;
            num /= 10;
            finalNumber += pow(lastDigits, noOfDigits);
        }
        System.out.println("final number is :  " + finalNumber);
        return  finalNumber == numCopy;
    }

    public static int pow( int num1, int num2){
        int result = 1;
        int i = 0;
        while (i < num2){
            result *= num1;
            i++;
        }
        System.out.println("pow of " + num1 + " is " + num1 );
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /= 10;
        }
        return digits; 
    }
}
