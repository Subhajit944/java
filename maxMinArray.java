import java.util.Scanner;
public class maxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min\n");
        int[] numArray = inputArray();
        int max = max(numArray);
        int min = min(numArray);
        System.out.println("Max of the Array is :   " + max);
        System.out.println("Min of the Array is :  " + min);
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

    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < numArr.length){
            if( min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }

        return min;
    }

    public static int max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i < numArr.length){
            if(max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}
