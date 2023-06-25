package prototype;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
    
}
