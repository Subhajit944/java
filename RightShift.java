
import java.util.Scanner;
public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to showcase of RightShift opretor\n");
        System.out.print("Please enter your number :   ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is :   " + result);
    }
}
