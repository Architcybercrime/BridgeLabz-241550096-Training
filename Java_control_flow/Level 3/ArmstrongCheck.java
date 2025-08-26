
public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp, digit;
        temp = num;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
