import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Odd & Even Calculator \n");
        System.out.print("Please enter your number :    ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("This is a Even number!");
        }else{
            System.out.println("This is a odd number!");
        }
    }
    
}
