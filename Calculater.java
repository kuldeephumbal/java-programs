import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            int result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Exiting calculator.");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}