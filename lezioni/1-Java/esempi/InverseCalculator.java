import java.util.Random;
import java.util.Scanner;

// InverseCalculator.java

public class InverseCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(10);
        int op = random.nextInt(4);

        int result;
        char opChar;

        switch (op) {
            case 0:
                result = a + b;
                opChar = '+';
                break;
            case 1:
                result = a - b;
                opChar = '-';
                break;
            case 2:
                result = a * b;
                opChar = 'x';
                break;
            case 3:
                result = a / b;
                opChar = '/';
                break;
            default:
                return;
        }

        System.out.print("What is " + a + " " + opChar + " " + b + "? ");

        // int answer = Integer.parseInt(System.console().readLine());
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();

        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
