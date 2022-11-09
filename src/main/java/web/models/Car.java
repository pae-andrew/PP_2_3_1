package web.models;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    public String model;

    @Column(name = "series")
    public String series;

    public Car(String model, String series) {
        this.model = model;
        this.series = series;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
