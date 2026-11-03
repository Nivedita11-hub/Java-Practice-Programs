public class Topic15_59_Tough {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);

            switch (i) {
                case 1:
                    System.out.println("Inside case 1");
                    break;

                case 2:
                    System.out.println("Inside case 2");
                    break;

                case 3:
                    System.out.println("Inside case 3");
                    break;
            }

            System.out.println("Back in the loop");
        }

        System.out.println("Loop ended");
    }
}