import java.util.Random;
import java.util.Scanner;

// InverseCalculator.java

public class InverseCalculator {
    private static char getRandomOp() {
        Random random = new Random();
        int op = random.nextInt(4);

        switch (op) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return 'x';
            case 3:
                return '/';
            default:
                return 'e';
        }
    }

    private static int calculateResult(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case 'x':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    @SuppressWarnings("resource")
    private static int readAnswer() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(10);

        char op = getRandomOp();
        int result = calculateResult(a, b, op);

        System.out.print("What is " + a + " " + op + " " + b + "? ");

        // int answer = Integer.parseInt(System.console().readLine());
        int answer = readAnswer();

        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
