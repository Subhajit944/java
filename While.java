import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age :    ");
        int age = input.nextInt();

        while(age < 0 || age > 100){
            System.out.println("Please enter your age :    ");
            age = input.nextInt();
        }
        System.out.println("Your age is :     " + age);
    }
}
