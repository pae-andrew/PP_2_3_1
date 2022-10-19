package web.models;

public class Car {

    public String model;
    public String series;
    public int age;

    public Car(String model, String series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", age=" + age +
                '}';
    }
}
