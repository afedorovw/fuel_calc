package calculator.repo;

import calculator.domain.cars.Car;
import calculator.domain.cars.Ferrari;
import calculator.domain.cars.Mercedes;
import calculator.domain.cars.RedBull;

import java.util.Map;

public class CarStore {

    private Map<String, Car> store = Map.of(
            "Ferrari", new Ferrari(),
            "Mercedes", new Mercedes(),
            "RedBull", new RedBull()
    );

    public Car lookup(String carName) {
        for (String key : store.keySet()) {
            if (key.equalsIgnoreCase(carName)) {
                return store.get(key);
            }
        }
        throw new IllegalArgumentException("Car not found for given name: " + carName);
    }

    public void showCars() {
        System.out.println(store.keySet());
    }

    public String[] cars() {
        String[] keys = new String[store.size()];
        int index = 0;
        for (Map.Entry<String, Car> mapEntry : store.entrySet()) {
            keys[index] = mapEntry.getKey();
            index++;
        }
        return keys;
    }
}
