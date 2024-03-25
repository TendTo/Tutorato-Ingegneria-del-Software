public class HelloWorldCreativo {
    private static int[] lettere={72,101,108,108,111,32,119,111,114,108,100,33};
    private static int dim=lettere.length;

    public static void main(String [] argv) {
        for(int i=0; i < dim; i++) {
            System.out.print((char)lettere[i]);
            }
        }
}

