public class Topic15_57_Easy {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }
    }
}