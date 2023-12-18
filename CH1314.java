class NotTriangleException extends Exception {
    public NotTriangleException() {
        super("不構成三角形");
    }
}

class EquilateralTriangleException extends Exception {
    public EquilateralTriangleException() {
        super("這是正三角形");
    }
}

class NotEquilateralTriangleException extends Exception {
    public NotEquilateralTriangleException() {
        super("這不是正三角形");
    }
}

public class Ex13_14 {
    public static void main(String[] args) {
        try {
            triangle(3, 3, 3); 
        } catch (NotTriangleException | EquilateralTriangleException | NotEquilateralTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void triangle(int a, int b, int c) throws NotTriangleException, EquilateralTriangleException, NotEquilateralTriangleException {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new NotTriangleException();
        } else if (a == b && a == c && b == c) {
            throw new EquilateralTriangleException();
        } else {
            throw new NotEquilateralTriangleException();
        }
    }
}
