import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to Driving License portal");
        System.out.print("Please enter your age :     ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("you are eligible to drive");

        }else{
            System.out.println(" You are not eligible  to drive ");

        }
    }
}
