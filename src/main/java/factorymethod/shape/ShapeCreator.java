package factorymethod.shape;

// Creator
public abstract class ShapeCreator {

    public abstract Shape createShape();

    public void drawShape() {
        Shape shape = createShape();
        shape.draw();
    }
}
