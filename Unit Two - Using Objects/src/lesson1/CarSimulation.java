package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", 2022, 2500);
        Car car2 = new Car("Hyundai", "Kona", 2022, 11000);

        car1.drive(1500);
        car2.printCarInfo(); 
    }
}
