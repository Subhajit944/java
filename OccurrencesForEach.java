import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");
        int[] nums = inputArray();
        System.out.println("Now , enter the number you want to search :   ");
        int element = input.nextInt();
        int occ = countOccurrences(nums, element);
        System.out.println("Your element was found :  " + occ + " times");

    }

    public static int countOccurrences (int[] nums, int element){
        int occ = 0;
        for(int num : nums) {
            if(num == element){
                occ++;
            }
        }
        return occ;
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
