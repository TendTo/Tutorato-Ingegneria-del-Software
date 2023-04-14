public class State {
    public static void main(String[] args) {
        Chest<String> chest = new Chest<String>();

        chest.addItem("Sword");
        chest.addItem("Shield");
        chest.addItem("Potion");

        System.out.println("Items in chest: " + chest.getItems());

        chest.close();

        // Exception
        System.out.println("Items in chest: " + chest.getItems());

        chest.open();

        System.out.println("Items in chest: " + chest.getItems());

        chest.seal();

        // Exception
        System.out.println("Items in chest: " + chest.getItems());

        // Da questo momento lo stato del baule rimane "Sealed"
        chest.open();
        chest.close();
    }
}
