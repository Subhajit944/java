import java.util.Scanner;

public class PalindromeArray {
public static void main(String[] args) {
    System.out.println("Welcome to Palindrme checker\n");
     int[] numArray =inputArray();
     boolean isPalin = isPalindrome(numArray);
     if(isPalin){
        System.out.println("Your  array is palindrome");
     }else{
        System.out.println("Your  array is not palindrome");
     }
}

public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element :    ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;

        while( i < size){
            System.out.print("please enter element no"+ (i+1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while(i < numArr.length / 2){
            if(numArr[i] != numArr[numArr.length - 1 -i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
 