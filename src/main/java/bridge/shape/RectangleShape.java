package bridge.shape;

public class RectangleShape extends Shape {

    private double x1, y1, x2, y2;

    public RectangleShape(double x1, double y1, double x2, double y2, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(x1, y1, x2, y2);
    }
}
