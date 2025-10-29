import java.util.Scanner;
public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to showcase of Not/compliment opretor\n");
        System.out.print("Please enter your number :   ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is :   " + result);
    }
}
