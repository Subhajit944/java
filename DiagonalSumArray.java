import java.util.Scanner;

public class DiagonalSumArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArr = inputArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of diagonals is :  " + sum);
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
    
    public static long sumOfDiagonals(int[][] numArr){
        long leftSum = sumOfDiagonals(numArr);
        long rightSum =sumOfDiagonals(numArr);
        long sum = leftSum + rightSum;
        if(numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }

     public static long sumOfLeftDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while(i < numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

     public static long sumOfRightDiagonals(int[][] numArr){
       long sum = 0;
       int i = 0;
       while( i < numArr.length){
        int col = numArr.length - 1 - i;
        sum +=  numArr[i][col];
        i++;
       }
        return sum;
    }
}
