package composite.product;

public abstract class ProductComponent {

    int id;
    String name;
    int price;

    public ProductComponent(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract int getCount();
    public abstract int getId();
    public abstract int getPrice();
    public abstract String getName();
    public abstract void addProduct(ProductComponent product);
    public abstract void removeProduct(ProductComponent product);
    public abstract void display();
}
