package Inheritance;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Employee employee = new Employee();

        employee.setFirstName("Mine");
        employee.setLastName("Cakir");

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.List();


    }
}
