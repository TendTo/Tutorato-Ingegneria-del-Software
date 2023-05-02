public class Main {
    public static void main(String[] args) {
        // Chest
        Chest chest = new Chest();
        
        chest.addItem("Sword");
        chest.addItem("Armor");
        chest.addItem("Boots");
        chest.addItem("Silver sword");
    
        Chest chest2 = null; //clone
        try {
            chest2 = (Chest) chest.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        chest.viewItems();
        chest2.addItem("Cloned sword");
        chest2.viewItems();

        // Big Chest
        BigChest bigChest = new BigChest();
        bigChest.addItem("Red potion");
        bigChest.addItem("Green potion");
        bigChest.addItem("Yellow potion");
        bigChest.addItem("Orange potion");
        bigChest.addItem("Pink potion");
        bigChest.addItem("Black potion");
        bigChest.addItem("Green potion");
        bigChest.addItem("Green potion");
        bigChest.addItem("Green potion");
        bigChest.addItem("Green potion");
        //bigChest.addItem("White potion"); //Full BigChest

        bigChest.viewItems();

        BigChest bigChest2 = null;
        try {
            bigChest2 = (BigChest) bigChest.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        bigChest2.addSkillBook("First skill book"); //No more space

        bigChest2.viewSkillBooks(); //No skill books
    }
}
