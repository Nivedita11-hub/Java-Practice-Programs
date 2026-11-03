public class Topic13_49_Tough {
    public static void main(String[] args) {
        int number = 21;
        int a = 0, b = 1;
        boolean found = false;

        while (a <= number) {
            if (a == number) {
                found = true;
                break;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        if (found)
            System.out.println("Number is in Fibonacci series");
        else
            System.out.println("Number is not in Fibonacci series");
    }
}