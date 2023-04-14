import java.util.ArrayList;
import java.util.List;

public class Adapter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        JSList<Integer> jsList = new JsListAdapter<>(list);

        jsList.push(1);
        jsList.push(2);
        jsList.push(3);
        jsList.push(4);
        jsList.push(5);
        System.out.println(jsList.getList());
        System.out.println(jsList.reverse().getList());
        System.out.println(jsList.filter(x -> (x & 1) == 0).getList());
        System.out.println(jsList.push(6).getList());
        System.out.println(jsList.pop());
        System.out.println(jsList.length());
    }
}