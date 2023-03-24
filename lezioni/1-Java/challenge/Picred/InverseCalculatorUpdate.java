import java.util.Random;

// InverseCalculator.java update

public class InverseCalculator {
    private static int result;


    /**
     * Genera un operatore casuale in base alla difficolta
     * @param difficolta : livello di difficolta, 1 oppure 2
     */
    private static char getRandomOp(short difficolta) {
        Random random = new Random();
        int op = random.nextInt(2);
        if(difficolta == 1){
            switch (op) {
                case 0:
                    return '+';
                case 1:
                    return '-';
                default:
                    return 'e';
            }
        } 
        else{
            switch (op) {
                case 0:
                    return '*';
                case 1:
                    return '/';
                default:
                    return 'e';
            }
        }
    }

    private static int calculateResult(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                    return a / b;
            default:
                return 0;
        }
    }


    /**Segnala l'errore ed esce dal programma */
    private static void getError(){
        System.err.println("Usage: java InverseCalculator <numeroDomande> <difficolta>");
        System.err.print("<difficolta> puo' essere: 1, 2");
        System.exit(1);
    }


    /**
     * Verifica la correttezza della risposta data dall'utente
     * @param answer : short
    */
    private static void checkAnswer(short answer){
        if (answer == result)
            System.out.println("Correct!");
        else
            System.out.println("Wrong!");
    }


    public static void main(String[] args) {
        if(args.length != 2)
            getError();

        short numeroDomande = Short.parseShort(args[0]);
        short difficolta = Short.parseShort(args[1]);

        if(numeroDomande <= 0 || difficolta<1 || difficolta >2)
            getError();


        while(numeroDomande > 0){
            Random random = new Random();
            int a = random.nextInt(20);
            int b = random.nextInt(10);
            char op = getRandomOp(difficolta);
            
            InverseCalculator.result = calculateResult(a, b, op);

            System.out.print("What is " + a + " " + op + " " + b + "? ");
            short answer = Short.parseShort(System.console().readLine());

            InverseCalculator.checkAnswer(answer);

            numeroDomande--;
        }
    }
}
