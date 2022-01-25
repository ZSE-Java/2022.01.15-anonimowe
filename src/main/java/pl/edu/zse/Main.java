package pl.edu.zse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Karol");
        list.add("Artur");
        list.add("Janusz");
        list.add("Bartek");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("BMW", "3", 200));
        cars.add(new Car("Audi", "A5", 400));
        cars.add(new Car("Skoda", "Octavia", 100));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car, Car t1) {
                return car.getBrand().compareTo(t1.getBrand());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car, Car t1) {
                return car.getPrice() - t1.getPrice();
            }
        });

        System.out.println(cars);
    }
}
