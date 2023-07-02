package observer.stock;

// Concrete Observer
public class StockInvestor implements Observer {

    private String name;

    public StockInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + "님, 주식 가격이 변동되었습니다.\n현재 가격은 $" + price + " 입니다.\n");
    }
}
