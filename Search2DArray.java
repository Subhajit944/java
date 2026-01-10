import java.util.Scanner;
public class Search2DArray {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to 2D search\n");
        inputArray();
        int[][] numArr = inputArray();
        System.out.print("Now enter the number you want to search");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if(isFound){
            System.out.println("Your number was found.");
        }else{
            System.out.println("Your number was not found.");
        }

        
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

    public static boolean search(int[][] numArr,  int num){
       int i = 0;
       while(i < numArr.length){
        int j = 0;
        while(j < numArr[i].length){
            if(numArr[i][j] == num){
                return true;
            }
            j++;
        }
        i++;
       }
        return false;
    }

}
