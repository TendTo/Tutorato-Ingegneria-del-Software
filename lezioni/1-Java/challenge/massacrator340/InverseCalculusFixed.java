import java.util.Random;
import java.util.Scanner;
import java.text.BreakIterator;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;

public class InverseCalculusFixed {
    static final char affermativo='y';
    static final char negativo='n';
    final static int limiteSuperiore=10;
    
    private static int readAnswer(Scanner scanner) {
        //Scanner scanner=new Scanner(System.in);
        int risposta;

        while(true) {
            try {
                risposta=scanner.nextInt();
                break;
            } catch(InputMismatchException e)  {
                System.err.println("try again: ");
                scanner.nextLine();
            }
        }

        return risposta;
    }

    private static char readChar(Scanner scan) {
        //Scanner scan=new Scanner(System.in);
        char c='a';
        while(true) {
            try {
            c=scan.next().charAt(0);
            } catch(InputMismatchException e) {
                scan.nextLine();
                continue;
            }
            catch(NoSuchElementException a) {
                System.err.println();
                System.err.print("You tried to access a token that doesn't exits");
                System.exit(-1);
            }

            if(c==affermativo || c==negativo) {
                break;
            } else
                System.err.print("You can only type y or n: ");
        }

        return c;
    }

    private static int newRandomInt() {
        Random rand=new Random();
        if(rand.nextInt(2)==0) {
            return rand.nextInt(limiteSuperiore);
        }
        else {
            return rand.nextInt(limiteSuperiore)*-1;
        }
    }

    private  static char newRandomOperator() {
        Random rand=new Random();
        switch(rand.nextInt(4)) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/';
            default:
                return '|';
        }
    }

    private static int operazione(char op,int a,int b) {
        switch(op) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if(a==0 || b==0) {
                    return 0;
                }
                return a/b;
            default:
                return '|';
        }
    }

    public static void main(String[] argv) {
        Scanner scan=new Scanner(System.in);
        int a, b, result;
        char op;
        a=newRandomInt();
        b=newRandomInt();
        op=newRandomOperator();
        int punteggio=0;

        while(true) {
            a=newRandomInt();
            b=newRandomInt();
            op=newRandomOperator();
            System.out.println("what is "+a+" "+op+" "+b+"? \t if one operand is 0 the result would be 0");
            result=operazione(op,a,b);
            int risposta=readAnswer(scan);
            if(risposta==result) {
                System.out.println("Correct! +1 point");
                punteggio++;
            } else  
                System.out.println("Wrong!!");

            System.out.print("Keep playing? y/n: ");

                char risp=readChar(scan);
                if(risp==negativo) {
                    System.out.println("You scored " + punteggio+ " points");
                    scan.close();
                    System.exit(0);
                } else if(risp==affermativo) {
                    continue;
                }
            
        }
    }
}
