package Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class TriangleTest {

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        isTriangle triangle = new isTriangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }
    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        isTriangle triangle = new isTriangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void noTriangle_test() {
        isTriangle triangle = new isTriangle();
        String type = triangle.classify(1, 4, 6);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("等边三角形")
    void dbTriangle_test() {
        isTriangle triangle = new isTriangle();
        String type = triangle.classify(4, 4, 4);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void dyTriangle_test() {
        isTriangle triangle = new isTriangle();
        String type = triangle.classify(4, 4, 7);
        assertEquals("等腰三角形", type);
    }

}