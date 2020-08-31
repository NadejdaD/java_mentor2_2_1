package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars", schema = "java_mentor")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "car_name")
    private String name;

    @Column(name = "car_series")
    private int series;

    public Car() {}

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getSeries() {return series;}
    public void setSeries(int series) {this.series = series;}

    @Override
    public String toString() {
        String result = getName() + " " + getSeries();
        return result;
    }
}
