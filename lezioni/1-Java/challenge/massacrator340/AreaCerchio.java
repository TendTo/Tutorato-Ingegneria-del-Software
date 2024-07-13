import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AreaCerchio {
    private static double radius;

    private static double CalcoloArea() {
        return (radius*radius)*3.14;
    }
    public static void main(String[] argv) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        while(true) {
        try {
            System.out.print("Insert radius: ");
            radius=scanner.nextDouble();
            scanner.close();
            break;
            }
        catch(InputMismatchException e) {
            System.out.println("Error, try again: ");
            scanner.nextLine();
            }
        }
        System.out.println("Area: "+CalcoloArea());
    } 
}
