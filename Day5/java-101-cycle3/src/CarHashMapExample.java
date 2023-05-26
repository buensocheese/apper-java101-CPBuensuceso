import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarHashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store car information
        Map<String, Car> carMap = new HashMap<>();

        // Create car objects; Initialize Values
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2020);
        Car car3 = new Car("Ford", "Mustang", 2022);

        // Add car objects to the map with unique keys
        carMap.put("c1", car1);
        carMap.put("c2", car2);
        carMap.put("c3", car3);

        // Get car object using a specific key
        Car retrievedCar = carMap.get("c2");
        System.out.println("Car retrieved using key 'c2': " + retrievedCar);

        // Get the number of entries in the map
        int mapSize = carMap.size();
        System.out.println("Number of entries in the map: " + mapSize);

        // Get a set of all keys in the map
        Set<String> keys = carMap.keySet();
        System.out.println("All keys in the map: " + keys);

        // Check if a specific key exists in the map
        boolean containsKey = carMap.containsKey("c3");
        System.out.println("Map contains key 'c3': " + containsKey);

        // Check if a specific car object exists in the map
        boolean containsValue = carMap.containsValue(car1);
        System.out.println("Map contains value 'car1': " + containsValue);
    }

    // Car class representing a car object
    static class Car {
        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return year + " " + make + " " + model;
        }
    }
}
