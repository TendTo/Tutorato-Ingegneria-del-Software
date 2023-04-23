public class Main {
    public static void main(String[] args){
        Queue<Integer> coda = new Queue<>();

        System.out.println(coda);
        System.out.println("la grandezza della coda è : " + coda.getSize());
        coda.insertHead(0);
        System.out.println("la grandezza della coda è : " + coda.getSize());
        coda.insert(80);
        System.out.println("la grandezza della coda è : " + coda.getSize());
        coda.insert(55);
        System.out.println("la grandezza della coda è : " + coda.getSize());
        System.out.println(coda);
        System.out.println("Eliminazione del primo valore della coda ");
        coda.delete();
        System.out.println("la grandezza della coda è : " + coda.getSize());
        System.out.println(coda);
    }
}
