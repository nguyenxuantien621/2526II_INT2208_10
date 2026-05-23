

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    private final TriangleClassifier classifier = new TriangleClassifier();


    @Test
    void testInvalidInput_NegativeOrZero() {
        // Cạnh bằng 0 hoặc số âm
        assertEquals("Invalid Input", classifier.classify(0, 5, 5));
        assertEquals("Invalid Input", classifier.classify(5, -1, 5));
        assertEquals("Invalid Input", classifier.classify(5, 5, 0));
    }

    @Test
    void testInvalidInput_GreaterThan100() {
        // Cạnh vượt quá 100
        assertEquals("Invalid Input", classifier.classify(101, 50, 50));
        assertEquals("Invalid Input", classifier.classify(50, 105, 50));
        assertEquals("Invalid Input", classifier.classify(50, 50, 200));
    }


    @Test
    void testNotATriangle() {
        // Tổng 2 cạnh nhỏ hơn hoặc bằng cạnh còn lại
        assertEquals("Not a Triangle", classifier.classify(1, 2, 3)); // 1+2 = 3
        assertEquals("Not a Triangle", classifier.classify(5, 1, 1)); // 1+1 < 5
        assertEquals("Not a Triangle", classifier.classify(10, 2, 5)); // 2+5 < 10
    }


    @Test
    void testEquilateralTriangle() {
        // Tam giác đều: 3 cạnh bằng nhau
        assertEquals("Equilateral", classifier.classify(5, 5, 5));
        assertEquals("Equilateral", classifier.classify(100, 100, 100));
    }

    @Test
    void testIsoscelesTriangle() {

        assertEquals("Isosceles", classifier.classify(5, 5, 3)); // a = b
        assertEquals("Isosceles", classifier.classify(3, 5, 5)); // b = c
        assertEquals("Isosceles", classifier.classify(5, 3, 5)); // a = c
    }

    @Test
    void testScaleneTriangle() {

        assertEquals("Scalene", classifier.classify(3, 4, 5));
        assertEquals("Scalene", classifier.classify(6, 8, 10));
    }
}