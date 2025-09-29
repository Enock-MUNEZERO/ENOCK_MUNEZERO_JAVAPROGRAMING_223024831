package ShapeTestAll;

import java.util.Scanner;

// ✅ Custom Rectangle class
class MyRectangle {
    private double width, height;

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// ✅ Custom Square class
class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

// ✅ Custom Circle class
class MyCircle {
    private double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// ✅ Custom Triangle class (3 sides)
class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class All_shapes {

    public static void main(String[] args) {
        Scanner shp = new Scanner(System.in);

        // ✅ Create shape objects
        MyRectangle screen = new MyRectangle(12, 20);
        Square box = new Square(4);
        MyCircle cir = new MyCircle(6);
        Triangle tr = new Triangle(2, 3, 5);

        char continueChoice;

        do {
            System.out.println("\nSelect a shape");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");

            int choice = shp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    int calc1 = shp.nextInt();
                    if (calc1 == 1)
                        System.out.println("Area: " + screen.calculateArea());
                    else if (calc1 == 2)
                        System.out.println("Perimeter: " + screen.calculatePerimeter());
                    else
                        System.out.println("Invalid calculation choice");
                    break;

                case 2:
                    System.out.println("1. Area");
                    System.out.println("2. Circumference");
                    int calc2 = shp.nextInt();
                    if (calc2 == 1)
                        System.out.println("Area: " + cir.calculateArea());
                    else if (calc2 == 2)
                        System.out.println("Circumference: " + cir.calculateCircumference());
                    else
                        System.out.println("Invalid calculation choice");
                    break;

                case 3:
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    int calc3 = shp.nextInt();
                    if (calc3 == 1)
                        System.out.println("Area: " + box.calculateArea());
                    else if (calc3 == 2)
                        System.out.println("Perimeter: " + box.calculatePerimeter());
                    else
                        System.out.println("Invalid calculation choice");
                    break;

                case 4:
                    System.out.println("1. Area");
                    System.out.println("2. Perimeter");
                    int calc4 = shp.nextInt();
                    if (calc4 == 1)
                        System.out.println("Area: " + tr.calculateArea());
                    else if (calc4 == 2)
                        System.out.println("Perimeter: " + tr.calculatePerimeter());
                    else
                        System.out.println("Invalid calculation choice");
                    break;

                default:
                    System.out.println("Invalid shape choice");
            }

            System.out.println("Do you want to continue? (y/n)");
            continueChoice = shp.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Program ended.");
        shp.close();
    }
}
