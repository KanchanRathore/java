class Employee1{
        // Attributes
        private int id;
        private String name;
        private double salary;

        // Constructor
        public Employee1(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public Employee1() {

        }

        // Method to display basic information
        public void displayInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: $" + salary);
        }

        // Getter and Setter methods omitted for brevity
        // ...

        // Manager subclass
        public static class Manager extends Employee {
            private String department;

            public Manager(int id, String name, double salary, String department) {
                super(id, name, salary);
                this.department = department;
            }

            public String getDepartment() {
                return department;
            }

            // Override displayInfo() method for Manager
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Department: " + department);
            }
        }

        // Developer subclass
        public class Developer extends Employee {
            private String programmingLanguage;

            public Developer(int id, String name, double salary, String programmingLanguage) {
                super(id, name, salary);
                this.programmingLanguage = programmingLanguage;
            }

            public String getProgrammingLanguage() {
                return programmingLanguage;
            }

            // Override displayInfo() method for Developer
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Programming Language: " + programmingLanguage);
            }
        }

        // Tester subclass
        public class Tester extends Employee {
            private String testingType;

            public Tester(int id, String name, double salary, String testingType) {
                super(id, name, salary);
                this.testingType = testingType;
            }

            public String getTestingType() {
                return testingType;
            }

            // Override displayInfo() method for Tester
            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Testing Type: " + testingType);
            }
        }
    }
    class Duplicate {
        public void main(String[] args) {
            Employee[] employees = new Employee[3];

            // Create instances of each subclass and assign them to the array
            employees[0] = new Employee1.Manager(201, "Mike Davis", 90000.0, "Marketing");
            employees[1] = new Employee1().new Developer(202, "Sarah Wilson", 100000.0, "Python");
            employees[2] = new Employee1().new Tester(203, "Chris Evans", 80000.0, "Manual");

            // Demonstrate polymorphism by calling displayInfo() for each employee
            System.out.println("Employee Information (Polymorphism):");
            for (Employee employee : employees) {
                employee.displayInfo();
                System.out.println(); // Add a new line for separation
            }
        }
    }
