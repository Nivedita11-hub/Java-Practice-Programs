public class Topic11_35_Moderate {
    public static void main(String[] args) {
        int month = 2;
        int year = 2024;
        int days;

        switch (month) {
            case 2:
                if ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0))
                    days = 29;
                else
                    days = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            default:
                days = 0;
        }

        if (days == 0)
            System.out.println("Invalid month");
        else
            System.out.println("Days = " + days);
    }
}