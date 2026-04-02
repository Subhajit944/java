package polymorphism;

public class Overloading {
    public int add(int a , int b){
        return  a + b ;
    }
    public String add(String a, String b){
        return a + b;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d ;
    }

    public static void main(String[] args){
        Overloading overloading = new Overloading();
        int sum = overloading.add(4, 5);
        System.out.println(overloading.add(4,sum));

    }
}
