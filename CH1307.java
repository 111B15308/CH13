public class CH1307 {
    public static void main(String args[]) {
        int[] arr = {4, 12, 87, 21, 6, 18};
        int[] den = {2, 0, 7, 0, 61, 0};
        double sum = 0.0;

        for (int i = 0; i <= 6; i++) {
            try {
                double result = (double) arr[i] / den[i];
                sum += result;
            } catch (ArithmeticException e) {
                System.out.println("除數為0: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("陣列索引值超出範圍: " + e.getMessage());
            }
        }

        System.out.println("sum = " + sum);
    }
}
