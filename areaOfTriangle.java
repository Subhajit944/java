import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to area calculator \n");
        System.out.println("Please enter your base in cm :  ");
        double base = input .nextDouble();

        System.out.print("Now, enter your height :    ");
        double height = input.nextDouble();

        double area  = 0.5 * base * height;
        System.out.println("the area of tringle  is :  " +  area + "cm");





    }
}
