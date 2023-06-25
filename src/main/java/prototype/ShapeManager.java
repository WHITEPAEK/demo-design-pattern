package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("Rectangle", new Rectangle());
        shapeMap.put("Circle", new Circle());
    }

    public static Shape getShape(String type) {
        Shape shape = shapeMap.get(type);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }

}
