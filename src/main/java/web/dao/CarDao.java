package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private final List<Car> auotomobile;
    {
        auotomobile = new ArrayList<>();
        auotomobile.add(new Car("Lada", 9, "red"));
        auotomobile.add(new Car("BMW", 5, "black"));
        auotomobile.add(new Car("Audi", 6, "green"));
        auotomobile.add(new Car("Pegeout", 4007, "grey"));
        auotomobile.add(new Car("Mercedes", 200, "white"));
    }

    public List<Car> count(Integer count) {
        return auotomobile.stream().limit(count).collect(Collectors.toList());
    }

}
