
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 26, month = 8, year = 2025;

        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int K = year % 100;
        int J = year / 100;

        int h = (day + (13 * (month + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Day of the week: " + days[h]);
    }
}
