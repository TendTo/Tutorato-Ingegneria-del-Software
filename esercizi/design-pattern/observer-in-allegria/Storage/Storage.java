import java.lang.String;

public class Storage extends Subject {

    private int[] product_qta;
    private String[] product_type;

    int pr_pointer;

    Storage() {
        product_qta = new int[100];
        product_type = new String[10];
        pr_pointer = 0;
    }

    public newProduct(String name, int )
    {
        product_type[pr_pointer] = name;
        product_qta[pr_pointer] = 0;
        pr_pointer+=1;
    }

    public void onChange() {
        return;
    }
}