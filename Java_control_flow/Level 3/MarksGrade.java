
public class MarksGrade {
    public static void main(String[] args) {
        int physics = 85, chemistry = 78, maths = 90;
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Percentage: " + percentage);

        if (percentage >= 85) {
            System.out.println("Grade: A - Excellent");
        } else if (percentage >= 70) {
            System.out.println("Grade: B - Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C - Average");
        } else {
            System.out.println("Grade: D - Needs Improvement");
        }
    }
}
