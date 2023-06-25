package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeManagerTests {

    @Test
    void clone_not_same() {
        Shape rectangle1 = ShapeManager.getShape("Rectangle");
        Shape rectangle2 = ShapeManager.getShape("Rectangle");
        assertNotSame(rectangle1, rectangle2);
    }

}