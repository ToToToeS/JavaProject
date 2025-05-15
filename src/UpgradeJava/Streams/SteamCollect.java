package UpgradeJava.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SteamCollect {
    public static void main(String[] args) {
        Car car1 = new Car(1, "bobus");
        Car car2 = new Car(1, "fobus");
        Car car3 = new Car(2, "dodus");
        Car car4 = new Car(2, "sosus");

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        //Map<Integer, List<Car>> map =  cars.stream().collect(Collectors.groupingBy(el -> el.way));
        Map<Boolean, List<Car>> map =  cars.stream().collect(Collectors.partitioningBy(el -> el.way < 2));

        for (Boolean i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}

class Car {
    int way;
    String name;

    public Car(int way, String name) {
        this.way = way;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "way=" + way +
                ", name='" + name + '\'' +
                '}';
    }
}
