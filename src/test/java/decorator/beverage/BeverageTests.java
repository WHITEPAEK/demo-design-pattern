package decorator.beverage;

import org.junit.jupiter.api.Test;

class BeverageTests {

    @Test
    void decorator_beverage_test() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ": $" + espresso.getCost());

        Beverage houseBlendWithMilk = new Milk(new HouseBlend());
        System.out.println(houseBlendWithMilk.getDescription() + ": $" + houseBlendWithMilk.getCost());

        Beverage houseBlendWithMilkAndMocha = new Mocha(new Milk(new HouseBlend()));
        System.out.println(houseBlendWithMilkAndMocha.getDescription() + ": $" + houseBlendWithMilkAndMocha.getCost());
    }

}
