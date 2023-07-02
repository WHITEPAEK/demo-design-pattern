package observer.stock;

import org.junit.jupiter.api.Test;

class StockMarketTests {

    @Test
    void price_update_notify_test() {
        StockMarket stockMarket = new StockMarket();

        Observer investor1 = new StockInvestor("John");
        Observer investor2 = new StockInvestor("Alice");

        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        stockMarket.setPrice(100.0);
        System.out.println("----------");
        stockMarket.setPrice(150.0);
        System.out.println("----------");
        stockMarket.removeObserver(investor2);
        stockMarket.setPrice(200.0);
    }

}
