package Singlton;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int mileage;

    // Private constructor to prevent instantiation
    private Car() {
       
    }

    // Private static instance of the class, lazily initialized
    private static Car instance;

    // Public method to provide access to the instance
    public static Car getCarInstance() {
    	instance = new Car();
        return instance;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
