public class Server {
    private PrepareMealCommand order;

    public void setOrder(PrepareMealCommand order) {
        this.order = order;
        this.order.setKitchen(Kitchen.getInstance());
    }

    public void makeOrder() {
        order.execute();
    }
}
