public class Topic13_46_Tough {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int digits = 0;
        int sum = 0;

        int temp = number;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}