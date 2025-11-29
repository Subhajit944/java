import java.util.Scanner;

import uploded.OccurrencesArray;
public class DeleteFromArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = inputArray();
        System.out.print("Now, Enter the number you want to delete:     ")
        int numToDelete = input.nextInt();
        int []newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        displayArray(numArr);
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

    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + "  ");
            i++;
        }
        System.out.println();
    }

    public static int[] deleteNumber(int[] numArr,int numToDelete){
        int occ = OccurrencesArray.noOfOccurrences(numArr, numToDelete);
        if(occ == 0){
            return numArr;


        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length){
            if(numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
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
