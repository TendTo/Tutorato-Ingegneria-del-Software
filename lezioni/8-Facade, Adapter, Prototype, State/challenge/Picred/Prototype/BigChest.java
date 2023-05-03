import java.util.ArrayList;
import java.util.List;

/*The BigChest has also SkillBooks */
public class BigChest extends Chest{
    public final int maxSize = 10;
    private List<String> skillBooks;
    private int numOfSkillBooks = 0;
    public BigChest(){
        super();
        this.skillBooks = new ArrayList<String>();
    }

    /**Adds a skill book to the list of skill books
     * @param name String
     */
    public void addSkillBook(String name){
        if(numOfSkillBooks + numOfItems < maxSize){
            this.skillBooks.add(name);
            numOfSkillBooks += 1;
        } else
            System.out.println("Full Big Chest. Can't add skill books.");
    }

    /**Print all of skill books */
    public void viewSkillBooks(){
        if(numOfSkillBooks > 0){
            System.out.print("Skill books: ");
            for(String book:skillBooks)
                System.out.print(book + " - ");
            System.out.println("\nTotal skill books: " + this.numOfSkillBooks);
        } else 
          System.out.println("No skill books.");
    }

    @Override
    public void addItem(String item){
        if(this.numOfItems < maxSize){
            this.items.add(item);
            this.numOfItems+=1;
        } else 
            System.out.println("Full big chest. Can't add items.");
    }


    @Override
    public BigChest clone() throws CloneNotSupportedException{
        BigChest clonedBigChest = (BigChest) super.clone();
        clonedBigChest.skillBooks = new ArrayList<String>(skillBooks);
        System.out.println("Second clone level!");
        return clonedBigChest;
    }
}