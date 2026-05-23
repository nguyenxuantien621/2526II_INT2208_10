

public class TriangleClassifier {

    public String classify(int a, int b, int c) {
        // 1. Kiểm tra ràng buộc dữ liệu đầu vào (1 <= a, b, c <= 100)
        if (a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
            return "Invalid Input";
        }

        // 2. Kiểm tra điều kiện tạo thành tam giác
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "Not a Triangle";
        }

        // 3. Phân loại tam giác
        if (a == b && b == c) {
            return "Equilateral"; // Tam giác đều
        } else if (a == b || b == c || a == c) {
            return "Isosceles"; // Tam giác cân
        } else {
            return "Scalene"; // Tam giác thường
        }
    }
}