import java.util.Scanner;
public class ageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to age calculator!!");
        System.out.print("Please enter your age:    ");
        int age = input.nextInt();

        if(age >= 65){
            System.out.println("You are a senior citizen");
        }else if(age >= 20){
            System.out.println("You are a adult");
        }else if(age >= 13){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are a child");
        }
    }
}
