// Calculator.java

class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <a> <op> <b>");
            System.out.println("<op> can be +, -, x, /");
            return;
        }

        int result;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "x":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }

        System.out.println(result);
    }
}