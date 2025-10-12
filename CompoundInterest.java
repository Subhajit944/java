import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to compound interest calculator\n");
        System.out.print("Please enter your principle amount Rs:   ");
        int principle =  input.nextInt();
        System.out.print("Now, tell me your rate of  intereset:    ");
        float rate = input.nextFloat();
        System.out.print("Now , tell me for how meny years are you borroing:   ");
        float years = input.nextFloat();

        double comInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your compound interest is Rs :  " + comInt);
        
    }
}
