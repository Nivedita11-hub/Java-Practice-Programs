public class Topic11_34_Moderate {
    public static void main(String[] args) {
        double a = 20;
        double b = 5;
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}