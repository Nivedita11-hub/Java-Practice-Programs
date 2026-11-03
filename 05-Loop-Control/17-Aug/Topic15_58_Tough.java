public class Topic15_58_Tough {
    public static void main(String[] args) {
        int target = 500;

        outer:
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {

                if (i * j > target) {
                    System.out.println("Pair = (" + i + ", " + j + ")");
                    break outer;
                }
            }
        }
    }
}