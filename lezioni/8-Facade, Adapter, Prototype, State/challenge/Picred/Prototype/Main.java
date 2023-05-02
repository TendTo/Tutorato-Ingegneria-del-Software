public class Main {
    public static void main(String[] args) {
        Chest chest = new Chest();
    
        chest.addItem("Spada");
        chest.addItem("Armatura");
        chest.addItem("Stivali");
    
        Chest chest2 = null;
        try {
            chest2 = (Chest) p.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        chest2.viewItems();
    }    
}
