import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Simple calculator application - you can add, substract, multiply and divide numbers");
                System.out.print("Enter the first number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number - Please try again");
                    scanner.next();
                    continue;
                }
                double firstNumber = scanner.nextDouble();

                System.out.print("Enter the operation symbol (+, -, *, /): ");
                String operation = scanner.next();
                if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                    System.out.println("Invalid symbol. Please try again");
                    continue;
                }

                System.out.print("Enter the second number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid number. Please try again.");
                    scanner.next();
                    continue;
                }
                double secondNumber = scanner.nextDouble();

                double result;
                switch (operation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.println("Result: " + result);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.println("Result: " + result);
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        System.out.println("Result: " + result);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            System.out.println("Error: You cannot divide by zero! Try again.");
                        } else {
                            result = firstNumber / secondNumber;
                            System.out.println("Result: " + result);
                        }
                        break;
                }

                System.out.print("Press Enter to exit:");
                System.in.read();
                break;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.next();
            }
        }

        scanner.close();
    }
}
