import java.util.Scanner;

public class PrimeFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to prime number checker");
    System.out.println("Please enter the number :   ");
    int num = input.nextInt();
    boolean isPrime = isPrime(num);
    System.out.println("Your number is " +
     (isPrime(num) ? " Peime" : " Not Prime"));

  } 
  
  public static boolean isPrime(int num){
    for(int i = 2; i < num; i++){
        if(num % i == 0){
            return false;
        }
    }
    return true;

  }
}
