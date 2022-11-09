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

//    @Autowired
//    EntityManager em;

    List<Car> cars = new ArrayList<>();

    @Autowired
    CarDAO carDAO = new CarDAOImpl();

    public CarsServiceImpl() {
        cars.add(new Car("BMW", "M3"));
        cars.add(new Car("BMW", "M3"));
        cars.add(new Car("BMW", "M3"));
        cars.add(new Car("BMW", "M3"));
        cars.add(new Car("BMW", "M3"));
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count, cars);
    }
}
