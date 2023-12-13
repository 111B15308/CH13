public class CH1305 {
    public static void main(String args[]) {
        int num = 5;
        int[] d = {3, 0, 0, 1};

        for (int i = 0; i < d.length; i++) {
            try {
                if (d[i] != 0) {
                    int result = num / d[i];
                    System.out.println(num + "/" + d[i] + "= " + result);
                } else {
                    System.out.println("除數為0不計算");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finally block executed.");
            }
        }
    }
}
