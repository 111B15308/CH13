public class CH1303{
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            if (den != 0) {
                int ans = num / den;
                System.out.println(ans);
            } else {
                System.out.println("除數為 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("End of main()!!");
    }
}
