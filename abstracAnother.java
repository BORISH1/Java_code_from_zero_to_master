package Java_code_from_zero_to_master;

public class abstracAnother extends abstractionExample{
    @Override
    public void employeeName (String name){
        System.out.println("The name of the employee " + name);
    }
    @Override
    public void employeeRole (String role){
        System.out.println("The role of the employee is " + role);
    }

    public static void main(String[] args) {
        abstracAnother obj = new abstracAnother();
        obj.employeeName("borish");
        obj.employeeRole("developer");
    }
}
