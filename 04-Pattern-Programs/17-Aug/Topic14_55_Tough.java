public class Topic14_55_Tough {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half
        for (int i = 1; i <= rows; i += 2) {
            for (int j = i; j < rows; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower half
        for (int i = rows - 2; i >= 1; i -= 2) {
            for (int j = rows; j > i; j -= 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}