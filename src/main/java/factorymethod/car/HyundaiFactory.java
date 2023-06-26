package factorymethod.car;

import java.util.HashMap;

public class HyundaiFactory extends CarFactory {

    HashMap<String, Car> carMap = new HashMap<>();

    @Override
    public Car createCar(String name) {
        return switch (name) {
            case "Sonata" -> new Sonata();
            case "Santafe" -> new Santafe();
            default -> null;
        };
    }

    @Override
    public Car returnMyCar(String name) {
        Car myCar = carMap.get(name);
        if (myCar == null) {
            if (name.equals("James")) {
                myCar = new Sonata();
            } else if (name.equals("Tomas")) {
                myCar = new Santafe();
            }
            carMap.put(name, myCar);
        }
        return myCar;
    }
}
