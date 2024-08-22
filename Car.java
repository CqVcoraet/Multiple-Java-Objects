import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Car {
    private String make;
    private String model;
    private int year;

    // Default Constructor
    public Car() {
        this.make = "Lexus";
        this.model = "ES 350";
        this.year = LocalDateTime.now().getYear();
    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
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

    public static void main(String[] args) {
        // Default Car
        Car car1 = new Car();
        System.out.println("Make " + car1.getMake());
        System.out.println("Model " + car1.getModel());
        System.out.println("Year " + car1.getYear());

        // Default Statement;
        System.out.println("I am meant for a " + car1.getYear() + " " + car1.getMake() + " " + car1.getModel());
    }
}