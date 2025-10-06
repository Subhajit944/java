import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to simple interest calculator.\n ");
        System.out.print("Please enter your principle amount Rs:   ");
        int principle =  input.nextInt();
        System.out.print("Now, tell me your rate of  intereset:    ");
        float rate = input.nextFloat();
        System.out.print("Now , tell me for how meny years are you borroing:   ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) /100;
        System.out.println("\n\n Your Simple  intrest is  Rs:  " + interest );
    }
}
  