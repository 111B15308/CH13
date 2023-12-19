import java.io.IOException;
import java.util.Scanner;

class ArgumentOutOfBoundException extends Exception {
    public ArgumentOutOfBoundException() {
        super("請輸入大於1的整數");
    }
}

public class CH1319 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入一個整數: ");
            int n = scanner.nextInt();
            boolean isPrime = prime(n);
            System.out.println(n + " 是否為質數: " + isPrime);
        } catch (ArgumentOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean prime(int n) throws ArgumentOutOfBoundException {
        if (n <= 1) {
            throw new ArgumentOutOfBoundException();
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
