public class studentToString {
   
    String name;
    int age;
    String rollNumber;
    String house;

    public studentToString(String name, int age, String rollNumber, String house){
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.house = house;


    }

    @Override
    public String toString() {
        return "Student Details: {name:"+ name 
        + " , age: " + age
        + " , rollNumber: " + rollNumber 
        + " , house:"+ house +"}" ;

    }

    public static void main(String[] args) {
    studentToString stu = new studentToString("Annesh",
     22, "001", "Shivaji");
     System.out.println(stu);
    }
}
