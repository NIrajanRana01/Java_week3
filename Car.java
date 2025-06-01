package Java_week3;

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnCar() {
        isAvailable = true;
    }

    public void printCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price Per Day: " + rentalPricePerDay);
        System.out.println("Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 50);
        car.printCarDetails();

        car.rentCar();
        System.out.println("\nAfter renting the car:");
        car.printCarDetails();

        car.returnCar();
        System.out.println("\nAfter returning the car:");
        car.printCarDetails();
    }
}

