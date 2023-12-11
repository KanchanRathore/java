class Vehicle {
        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    class Car extends Vehicle {
        private int numberOfDoors;
        private boolean isSedan;
        private double engineSize;
        private boolean isAutomatic;

        public Car(String make, String model, int year, int numberOfDoors, boolean isSedan, double engineSize, boolean isAutomatic) {
            super(make, model, year);
            this.numberOfDoors = numberOfDoors;
            this.isSedan = isSedan;
            this.engineSize = engineSize;
            this.isAutomatic = isAutomatic;
        }

        public void displayCarInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
            System.out.println("Is Sedan: " + isSedan);
            System.out.println("Engine Size: " + engineSize + " liters");
            System.out.println("Is Automatic: " + isAutomatic);
        }
    }

    class Motorcycle extends Vehicle {
        private int topSpeed;
        private boolean hasSidecar;
        private String bikeType;

        public Motorcycle(String make, String model, int year, int topSpeed, boolean hasSidecar, String bikeType) {
            super(make, model, year);
            this.topSpeed = topSpeed;
            this.hasSidecar = hasSidecar;
            this.bikeType = bikeType;
        }

        public void displayMotorcycleInfo() {
            super.displayInfo();
            System.out.println("Top Speed: " + topSpeed + " mph");
            System.out.println("Has Sidecar: " + hasSidecar);
            System.out.println("Bike Type: " + bikeType);
        }
    }

    public class _2104385_asg04_1 {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", "Camry", 2022, 4, true, 2.5, true);
            Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023, 120, false, "Cruiser");

            System.out.println("Car Information:");
            myCar.displayCarInfo();

            System.out.println("\nMotorcycle Information:");
            myMotorcycle.displayMotorcycleInfo();

            // Assigning a Car object to a Vehicle reference
            Vehicle vehicleRef = myCar;
            System.out.println("\nAssigned Car object to a Vehicle reference:");
            vehicleRef.displayInfo();
        }
    }

