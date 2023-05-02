/*Una chest ha degli item (armi, scudi, pozioni) e in base al tipo di chest
ha item di una certa rarità */
import java.util.ArrayList;
import java.util.List;

public class Chest implements Cloneable{
    private List<String> items;
    private int size;

    public Chest(){
        items = new ArrayList<String>();
        this.size = 0;
    }


    public void addItem(String item){
        this.items.add(item);
        this.size+=1;
    }


    public void viewItems(){
        System.out.print("Items in the chest: ");
        for(String item:items){
            System.out.print(item + " ");
        }
    }


    @Override
    public Chest clone() throws CloneNotSupportedException{
        Chest clonedChest = (Chest) super.clone();
        clonedChest.items = new ArrayList<String>(this.items);
        return clonedChest;
    }
}