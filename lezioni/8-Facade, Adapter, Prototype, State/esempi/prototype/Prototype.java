import java.util.ArrayList;
import java.util.List;

// Deve implementare Cloneable
public class Prototype implements Cloneable {
    private String name;
    private int n;
    private List<String> list;

    public Prototype(String name, int n) {
        this.name = name;
        this.n = n;
        this.list = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void add(String s) {
        list.add(s);
    }

    @Override
    public String toString() {
        return "Prototype: [name: " + name + ", n: " + n + ", list: " + list + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Chiamata al metodo clone() della superclasse
        Prototype p = (Prototype) super.clone();
        // Copia profonda
        p.list = new ArrayList<String>(list);
        return p;
    }

    public static void main(String[] args) {
        Prototype p = new Prototype("pippo", 10);
        p.add("hello");
        Prototype pClone = null;
        try {
            pClone = (Prototype) p.clone();
        } catch (CloneNotSupportedException e) {
        }
        System.out.println("Original ->\t" + p);
        System.out.println("Clone ->\t" + pClone);

        pClone.setName("pluto");
        pClone.setN(20);
        pClone.add("ciao");

        System.out.println("Original ->\t" + p);
        System.out.println("Clone ->\t" + pClone);
    }
}
