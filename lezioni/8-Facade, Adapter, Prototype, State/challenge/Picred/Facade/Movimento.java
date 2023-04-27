import java.util.List;
import java.util.ArrayList;

public class Movimento {
    private List<String> movimenti = new ArrayList<>();

    public void stampaMovimenti() {
        System.out.println("I movimenti effettuati sono: ");

        for (String m : movimenti)
            System.out.println(m);
    }

    public void salva(String desc) {
        movimenti.add(desc);
    }
}