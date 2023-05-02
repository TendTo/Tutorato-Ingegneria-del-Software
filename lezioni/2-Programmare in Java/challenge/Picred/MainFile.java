public class MainFile {
    public static void main(String[] args) {
        File file = new File("output.txt");

        file.write("Test1 Test2 Test3 \nTest4 Test5 Test6 \nTest7 Test8 Test9");

        System.out.println(file.readFirstLine());
        // System.out.println(file.readAllLines());
    }
}