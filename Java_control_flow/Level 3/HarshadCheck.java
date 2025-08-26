
public class HarshadCheck {
    public static void main(String[] args) {
        int num = 18, sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0)
            System.out.println(num + " is a Harshad number.");
        else
            System.out.println(num + " is not a Harshad number.");
    }
}
