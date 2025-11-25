import java.util.Scanner;

public class SumAverage2dArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and Average of 2D Array\n");
        int[][] numArr =inputArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is : " + sum);
        System.out.println("Your average if array is : " + avg);


    }


    public static int[][] inputArray(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of rows :    ");
    int rows = input.nextInt();
    System.out.print("Please enter the number of columns:   ");
    int columns = input.nextInt();
    int[][] numArray = new int[rows][columns];
    int i = 0;
    while(i < rows){
        int j = 0;
        while(j < columns){
            System.out.print("Please enter the number of rows:" + (i+1) + " ,  column: " + (j+1) + "  :   ");
            numArray[i][j] = input.nextInt();
            j++;
        }
        i++;
    }
    return numArray;
   
    }

    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }

        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / size;
        
    }

    public static long sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while(j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
