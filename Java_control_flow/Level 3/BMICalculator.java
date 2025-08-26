
public class BMICalculator {
    public static void main(String[] args) {
        double weight = 68; // in kg
        double height = 1.75; // in meters
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
