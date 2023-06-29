package decorator.coffee;

import org.junit.jupiter.api.Test;

class CoffeeTests {

    @Test
    void decorator_coffee_test() {
        Coffee ethiopiaAmericano = new EthiopiaAmericano();
        ethiopiaAmericano.brewing();
        System.out.println();

        Mocha kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();
        System.out.println();
    }

}
