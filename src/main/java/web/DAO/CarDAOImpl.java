package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getCars(int count, List<Car> cars) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
