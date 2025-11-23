public class ArrayType2 {
      public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 98;
        myArr[1 ]= 65;
        myArr[2 ]= 55;
        myArr[3 ]= 45;
        myArr[4 ]= 35;

        int index = 0;
        while (index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
      }
}
