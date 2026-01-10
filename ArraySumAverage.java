import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {
    System.out.println("Welcome to Array sum and Average");
    int[] numArray = inputArray();
    long sum = sum(numArray);
    double avg = average(numArray);
    System.out.println(" Sum of the  number is :  " + sum);
    System.out.println("Average of the number is : " + avg);

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

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        long sum = sum(numArray);
        return (double) (sum / numArray.length);
        
    }
    
}
