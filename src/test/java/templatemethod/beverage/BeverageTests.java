package templatemethod.beverage;

import org.junit.jupiter.api.Test;

class BeverageTests {

    @Test
    void make_beverage_test() {
        Beverage coffee = new Coffee();
        coffee.makeBeverage();

        System.out.println("------------------");

        Beverage tea = new Tea();
        tea.makeBeverage();
    }

}
