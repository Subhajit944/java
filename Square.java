package challenge83;

public class Square extends Shape {
    
    @Override
    public double calculateArea(){
        return  Math.pow(sideInCms, 2);
    }

    private final double sideInCms;

    public Square(double sideInCms){
        this.sideInCms = sideInCms;
    }

    public double getSideInCms(){
        return sideInCms;
    }
}
