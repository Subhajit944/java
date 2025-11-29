import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check post\n");
        int[] numArr = inputArray();
        boolean isInc = isDecreasing(numArr);
        boolean isDec = isIncreacing(numArr);

        if(isInc || isDec){
            System.out.println("Your Array is sorted");
        }else{
            System.out.println("Your Array is  not sorted");
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
    
    public static boolean isDecreasing(int[] numArr){
        int i =1 ;
        while (i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
            
    }

    public static boolean isIncreacing(int[] numArr){
        int i =1 ;
        while (i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
