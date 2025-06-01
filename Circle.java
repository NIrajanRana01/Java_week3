package Java_week3;

public class Circle {
    
    private double radius;

    // Setter method to set the value of radius
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    
    public double getRadius() {
        return radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7.5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
