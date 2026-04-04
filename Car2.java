package myCode;

public class Car2 {
    
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPorchase;

    public Car2(){

        
    }

    public Car2(String color, String model, double fuelLevel,long costOfPorchase){
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPorchase =costOfPorchase;
    }
    @Override
    public String toString (){
    final StringBuilder sb = new StringBuilder("Car{");
    sb.append("color='").append(color).append('\'');
    sb.append(", model='").append(model).append('\'');
    sb.append(", fuelLevel='").append(fuelLevel);
    sb.append(", costOfPorchase='").append(costOfPorchase);
    sb.append('}');
    return sb.toString();

    }
}
