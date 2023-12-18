class Test {
    static void test(int num, int den) {
        if (den == 0) {
            throw new ArithmeticException("除數不能為零");
        }
        System.out.println(num + "/" + den + "=" + num / den);
    }
}

public class CH1310{
    public static void main(String[] args) {
        try {
            Test.test(5, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); 
        }
    }
}
