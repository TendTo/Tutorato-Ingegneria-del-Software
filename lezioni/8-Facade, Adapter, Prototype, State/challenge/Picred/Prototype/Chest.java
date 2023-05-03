import java.util.ArrayList;
import java.util.List;

public class Chest implements Cloneable{
    protected List<String> items;
    protected int numOfItems;
    public final int maxSize = 5;

    public Chest(){
        items = new ArrayList<String>();
        this.numOfItems = 0;
    }

    /**Adds an item to the list of items
     * @param item String
     */
    public void addItem(String item){
        if(numOfItems < maxSize){
            this.items.add(item);
            this.numOfItems+=1;
        } else 
            System.out.println("Full chest. Can't add items.");
    }


    /**Show all of items in the chest*/
    public void viewItems(){
        if(numOfItems > 0){
            System.out.print("List of items: ");
            for(String item:items){
                System.out.print(item + " - ");
            }
            System.out.println("\nTotal items: " + this.numOfItems);
        } else 
            System.out.println("No items.");
    }
    
    /**Show the number of items
     * @return number of items
     */
    public int getNumOfItems(){
        return this.numOfItems;
    }


    @Override
    public Chest clone() throws CloneNotSupportedException{
        Chest clonedChest = (Chest) super.clone();
        clonedChest.items = new ArrayList<String>(this.items);
        System.out.println("First clone level!");
        return clonedChest;
    }
}