package composite.product;

public class Product extends ProductComponent {

    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addProduct(ProductComponent product) { }

    @Override
    public void removeProduct(ProductComponent product) { }

    @Override
    public void display() {
        System.out.println("Product: " + name);
    }
}
