import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;

        System.out.println("Welcome to the number gussing game");

        do{
            System.out.print("Please guess the number between 1 to 10 :");
            guess = input.nextInt();
        }while(num != guess);
        System.out.println("You have successfuly guessed the number");

    }
}
