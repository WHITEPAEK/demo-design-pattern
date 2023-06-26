package factorymethod.shape;

// ConcreteCreator
public class CircleCreator extends ShapeCreator {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
