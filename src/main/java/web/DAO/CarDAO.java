package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {

//    void add(Car car);
//
//    List<Car> listCars();
//
//    Car getCarByModelAndSeries(String model, int series);

//    void save(Car car);

    List<Car> getCars(int count, List<Car> cars);
}
