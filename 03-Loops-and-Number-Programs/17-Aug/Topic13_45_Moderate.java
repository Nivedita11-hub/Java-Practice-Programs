public class Topic13_45_Moderate {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        int sum = 0;

        for (int i = 0, j = 1; i < n; i++, j++) {
            sum += a;

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum = " + sum);
    }
}