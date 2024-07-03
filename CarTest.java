package pack.Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Camry", 2020, 75.0);
    }

    @Test
    public void testDrivePositiveDistance() {
        double initialMileage = car.mileage;
        car.drive(100.0);
        assertEquals(initialMileage + 100.0, car.mileage);
    }

    @Test
    public void testDriveNegativeDistance() {
        double initialMileage = car.mileage;
        car.drive(-50.0);
        assertEquals(initialMileage, car.mileage); // Mileage should not change
    }

    @Test
    public void testPrintCarDetails() {
        car.printCarDetails();
        // Here you would typically need a way to capture and verify the console output
        // This can be done using libraries like System Lambda, but it's beyond the basic scope here.
    }
}
