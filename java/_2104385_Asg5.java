class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}
class Manager extends Employee {
    private String department;
    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manager Department: " + department);
    }
}
class Developer extends Employee {
    private String programmingLanguage;
    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
}
class Tester extends Employee {
    private String testingType;
    public Tester(int id, String name, double salary, String testingType) {
        super(id, name, salary);
        this.testingType = testingType;
    }
    public String getTestingType() {
        return testingType;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tester Testing Type: " + testingType);
    }
}

public class _2104385_Asg5 {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Kanchan Rathore", 75000, "HR");
        Developer developer = new Developer(2, "Aliya Khan", 65000, "Java");
        Tester tester = new Tester(3, "James Crew", 60000, "Manual");
       Employee[] employees = new Employee[3];
        employees[0] = manager;
        employees[1] = developer;
        employees[2] = tester;
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
