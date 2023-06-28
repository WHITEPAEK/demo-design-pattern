package bridge.shape;

// ConcreteImplementor
public class DrawingAPI1 implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double r) {
        System.out.println("API 1로 원을 그립니다. 중심: (" + x + ", " + y + "), 반지름: " + r);
    }

    @Override
    public void drawRectangle(double x1, double y1, double x2, double y2) {
        System.out.println("API 1로 사각형을 그립니다. 좌상단: (" + x1 + ", " + y1 + "), 우하단: (" + x2 + ", " + y2 + ")");
    }
}
