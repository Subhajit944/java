import java.util.Scanner;
public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array occurences\n");
        int[] numArray = inputArray();
        System.out.print("Now enter the number you went to find :   ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArray, num);
        System.out.println("Your element was found " + occurrences + " time is Array ");
        

        
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

    public static int noOfOccurrences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
