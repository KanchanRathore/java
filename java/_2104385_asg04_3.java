
    import java.lang.Math;

    class Shape {
        public double area() {
            return 0.0; // Placeholder for area calculation
        }

        public double perimeter() {
            return 0.0; // Placeholder for perimeter calculation
        }
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        @Override
        public double perimeter() {
            return 2 * (length + width);
        }
    }

    class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public double area() {
            // Using Heron's formula to calculate the area of a triangle
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }

    public class _2104385_asg04_3 {
        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);
            Triangle triangle = new Triangle(3.0, 4.0, 5.0);

            // Display area and perimeter for each shape
            System.out.println("Circle:");
            System.out.println("Area: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());

            System.out.println("\nRectangle:");
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());

            System.out.println("\nTriangle:");
            System.out.println("Area: " + triangle.area());
            System.out.println("Perimeter: " + triangle.perimeter());
        }
    }
