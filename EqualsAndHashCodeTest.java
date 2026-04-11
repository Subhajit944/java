package equals;

public class EqualsAndHashCodeTest {
    
    public static void main(String[] args) {
        Person person1 = new Person("subhajit", 32, "GHDE23");
        Person person2 = new Person("annesh", 22, "AJSGS2234");

    

    if(person1 == person2) {
        System.out.println("Equals");
    }else{
        System.out.println("Not Equsls");
    }
  }
}
