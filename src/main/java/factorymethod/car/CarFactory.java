package factorymethod.car;

public abstract class CarFactory {

    public abstract Car createCar(String name);
    public abstract Car returnMyCar(String name);

}
