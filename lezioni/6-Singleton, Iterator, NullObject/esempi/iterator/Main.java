public class Main {
    public static void main(String[] args) {
        Cipher cipher = new Cipher(3);
        cipher.encrypt("Hello World!");
        System.out.println(cipher);
    }
}
