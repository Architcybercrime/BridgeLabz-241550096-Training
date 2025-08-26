
public class CalculatorSwitch {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Division by zero error!");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
