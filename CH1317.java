import java.util.Scanner;

class IntegerLessThanZero extends Exception {
    public IntegerLessThanZeroException() {
        super("您輸入的整數的值小於0");
    }
}
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZeroException() {
        super("您輸入的整數的值大於0");
    }
}
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZeroException() {
        super("您輸入的整數的值為0");
    }
}
public class CH1317{
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入一個整數: ");
            int input = scanner.nextInt();
            validateInput(input);
        } catch (IntegerLessThanZero | IntegerGreaterThanZero | IntegerEqualToZero e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入錯誤：" + e.getMessage());
        }
    }

    static void validateInput(int value) throws IntegerLessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        if (value < 0) {
            throw new IntegerLessThanZero();
        } else if (value > 0) {
            throw new IntegerGreaterThanZero();
        } else {
            throw new IntegerEqualToZero();
        }
    }
}
