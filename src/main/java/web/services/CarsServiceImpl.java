package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    @Autowired
    CarDAO carDAO = new CarDAOImpl();

    public CarsServiceImpl() {
        cars.add(new Car("BMW", "M3", 3));
        cars.add(new Car("BMW", "X7", 1));
        cars.add(new Car("Lexus", "RX400h", 10));
        cars.add(new Car("Toyota", "Camry", 2));
        cars.add(new Car("Dodge", "Stratus", 21));
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count, cars);
    }
}
