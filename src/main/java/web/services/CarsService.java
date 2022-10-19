package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsService {

    List<Car> cars = new ArrayList<>();

    public CarsService() {
        cars.add(new Car("BMW", "M3", 3));
        cars.add(new Car("BMW", "X7", 1));
        cars.add(new Car("Lexus", "RX400h", 10));
        cars.add(new Car("Toyota", "Camry", 2));
        cars.add(new Car("Dodge", "Stratus", 21));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
