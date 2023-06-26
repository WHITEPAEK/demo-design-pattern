package factorymethod.shape;

// ConcreteCreator
public class RectangleCreator extends ShapeCreator {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
