package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Service {

    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Mustang", 1967, "Red"),
            new Car("El Camino", 1979, "Grey"),
            new Car("Plymouth", 1961, "Navy"),
            new Car("Pontiac", 1977, "Blue"),
            new Car("Dodge", 1959, "Black")));

    public List<Car> getListCars(int count) {
        if (count < 5 && count > 0) {
            cars = cars.subList(0, count);
        }
        return cars;
    }

}
