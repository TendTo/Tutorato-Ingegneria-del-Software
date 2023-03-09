// Calculator.java

class Calculator {
    private static int calculateResult(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "x":
                return a * b;
            case "/":
                return a / b;
            default:
                System.err.println("Unknown operator");
                System.exit(1);
                return 0;
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java Calculator <a> <op> <b>");
            System.err.println("<op> can be +, -, x, /");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = calculateResult(a, b, args[1]);

        System.out.println(result);
    }
}