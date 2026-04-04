package myCode;

public class AccessTest {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.color ="Red";
        car.model ="Swift";
        System.out.println(car);
        Car2 newCar = new Car2("Black","BMW",
        1,5000);

        System.out.println(car);
    }
}
