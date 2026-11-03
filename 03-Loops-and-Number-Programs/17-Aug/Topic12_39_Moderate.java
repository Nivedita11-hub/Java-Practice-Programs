public class Topic12_39_Moderate {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
    }
}