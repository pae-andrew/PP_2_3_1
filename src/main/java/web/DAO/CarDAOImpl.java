package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.Car;

import javax.persistence.*;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

//    @Override
//    @Transactional
//    public void add(Car car) {
//        em.getTransaction().begin();
//        em.persist(car);
//        em.getTransaction().commit();
//    }

//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Car> listCars() {
//        return em.createQuery("SELECT c from Car c").getResultList();
//    }
//
//    @Override
//    public Car getCarByModelAndSeries(String model, int series) {
//        String hql = "Select c from Car c where c.model = ?1 and c.series = ?2";
//        List<Car> car = em.createQuery(hql)
//                .setParameter(1, model)
//                .setParameter(2, series)
//                .getResultList();
//        return car.get(0);
//    }

//    public void save(Car car) {
//        em.getTransaction().begin();
//        em.persist(car);
//        em.getTransaction().commit();
//    }

    @Override
    public List<Car> getCars(int count, List<Car> cars) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
