import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("We are doing Float Multiplacation");
        System.out.print("Please enter first number :   ");
        double first = input.nextDouble();
        System.out.print("Now, please enter second number :  ");
        double second = input.nextDouble();

        double mul = first * second;

        System.out.println("\n result is :  " + mul);
            
    }
}
