package challange79;

public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(null, 022, 045000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());

    }
}
