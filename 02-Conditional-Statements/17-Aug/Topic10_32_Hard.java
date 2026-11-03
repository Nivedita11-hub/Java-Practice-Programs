public class Topic10_32_Hard {
    public static void main(String[] args) {
        double a = 1;
        double b = -5;
        double c = 6;

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Real and distinct roots");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);

        } else if (d == 0) {
            double r = -b / (2 * a);

            System.out.println("Real and equal roots");
            System.out.println("Root = " + r);

        } else {
            System.out.println("Imaginary roots");
        }
    }
}