package bridge.shape;

public class CircleShape extends Shape {

    private double x, y, r;

    public CircleShape(double x, double y, double r, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, r);
    }
}
