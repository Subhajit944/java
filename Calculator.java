package utils;

import geometry.Circle;
import geometry.Rectangle;

public class Calculator {
    
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 05);
    
    double cirArea = Math.PI* Math.pow(cir.radius, 2);
    double rectArea =rect.breadth * rect.length;

    System.out.printf("Area of the circle is : %f, Area of the Rectangle is : %f" , cirArea, rectArea);
   }
}
