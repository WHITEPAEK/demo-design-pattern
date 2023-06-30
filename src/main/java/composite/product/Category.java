package composite.product;

import java.util.ArrayList;

public class Category extends ProductComponent {

    ArrayList<ProductComponent> components;

    public Category(int id, String name, int price) {
        super(id, name, price);
        components = new ArrayList<>();
    }

    @Override
    public int getCount() {
        int count = 0;
        for (ProductComponent component : components) {
            count += component.getCount();
        }
        return count;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ProductComponent component : components) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addProduct(ProductComponent product) {
        components.add(product);
    }

    @Override
    public void removeProduct(ProductComponent product) {
        for (ProductComponent component : components) {
            if (component.getId() == product.getId()) {
                components.remove(component);
                return;
            }
        }
        System.out.println("Empty...");
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (ProductComponent component : components) {
            component.display();
        }
    }
}
