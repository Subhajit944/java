public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modleNumber;
    String company;

    public Car( int noOfWheels, int noOfDoors, int maxSpeed, String name, String  modelNumber, String company){
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed =maxSpeed;
        this.name = name;
        this.modleNumber = modelNumber;
        this.company = company;
    }


    public static void main(String[] args) {
        
        Car Swift = new Car(4, 4, 120, 
             "Swift", "SW789", "tata");
    }

  

}
