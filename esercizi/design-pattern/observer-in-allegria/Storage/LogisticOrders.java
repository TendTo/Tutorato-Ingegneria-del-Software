package Storage;

public class LogisticOrders implements Observer {

    public void update(Subject subject, Object state /* Product id */ ) {
        if (subject instanceof Storage store) {
            System.out.println("Rifornisco il prodotto: " + storage.);
        }
    }
}