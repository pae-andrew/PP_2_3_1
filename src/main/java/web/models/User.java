package web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    public long id;

    @Column
    public String name;

    @Column
    public String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{ name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
