
    class Employee {
        private String name;
        private String employeeID;
        private String designation;

        public Employee(String name, String employeeID, String designation) {
            this.name = name;
            this.employeeID = employeeID;
            this.designation = designation;
        }

        public void displayDetails() {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }

        // Getter and Setter methods for name and designation
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        // Method to calculate salary (to be overridden by subclasses)
        public double calculateSalary() {
            return 0.0;
        }
    }

    class Manager extends Employee {
        private double baseSalary;
        private double bonus;

        public Manager(String name, String employeeID, double baseSalary, double bonus) {
            super(name, employeeID, "Manager");
            this.baseSalary = baseSalary;
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Bonus: $" + bonus);
        }
    }

    class Developer extends Employee {
        private double hourlyRate;
        private int hoursWorked;

        public Developer(String name, String employeeID, double hourlyRate, int hoursWorked) {
            super(name, employeeID, "Developer");
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Hours Worked: " + hoursWorked);
        }
    }

    class Salesperson extends Employee {
        private double commission;
        private int sales;

        public Salesperson(String name, String employeeID, double commission, int sales) {
            super(name, employeeID, "Salesperson");
            this.commission = commission;
            this.sales = sales;
        }

        @Override
        public double calculateSalary() {
            return commission * sales;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Commission Rate: $" + commission);
            System.out.println("Total Sales: " + sales);
        }
    }

    public class _2104385_asg04_2
    {
        public static void main(String[] args) {
            Manager manager = new Manager("Jignesh", "M001", 5000.0, 1000.0);
            Developer developer = new Developer("Amit", "D001", 25.0, 160);
            Salesperson salesperson = new Salesperson("Bobby", "S001", 0.1, 100);

            // Display employee details and salaries
            System.out.println(" ");
            System.out.println("Manager Details:");
            manager.displayDetails();
            System.out.println("Salary: $" + manager.calculateSalary());

            System.out.println(" ");
            System.out.println("\nDeveloper Details:");
            developer.displayDetails();
            System.out.println("Salary: $" + developer.calculateSalary());

            System.out.println(" ");
            System.out.println("\nSalesperson Details:");
            salesperson.displayDetails();
            System.out.println("Salary: $" + salesperson.calculateSalary());

            // Update employee details
            developer.setName("Ashok");
            developer.setDesignation("Senior Developer");

            System.out.println("\nUpdated Developer Details:");
            developer.displayDetails();
            System.out.println("Salary: $" + developer.calculateSalary());
        }
    }

