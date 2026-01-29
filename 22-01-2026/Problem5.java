class Employee{
    static String companyName;
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary,String companyName){
        this.id=id;
        this.name=name;
        this.salary=salary;
        Employee.companyName=companyName;
    }
    public double calculateAnnualSalary(){
        return salary*12;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Company Name: " + companyName);
    }

}
public class Problem5 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rohith", 5000.0, "Innovatech");
        emp1.displayEmployeeDetails();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());       
      
        System.out.println();
        
        Employee emp2 = new Employee(2, "Ananya", 6000.0, "Innovatech");
        emp2.displayEmployeeDetails();  
        System.out.println("Annual Salary: " + emp2.calculateAnnualSalary());
    }
}
