import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum\n");
        int[] arr =inputArray();

        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(max < num) {
                max = num;
            }
        }

        System.out.println("Miximum number is :  " + max);
        
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
}
 