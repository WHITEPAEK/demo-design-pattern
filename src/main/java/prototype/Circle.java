package prototype;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
