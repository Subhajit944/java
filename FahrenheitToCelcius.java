import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to Temperature converter");
        System.out.print("Enter your temp in F:  ");
        float fah = input.nextFloat();
        float cel = (fah - 32 ) *   5/9;
        System.out.println("Your temperature is :  " + cel +"C"); 
    }
}
