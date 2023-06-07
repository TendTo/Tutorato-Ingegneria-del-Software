class Main {
    public static void main(String[] args) {
        Server server = new Server();

        server.setOrder(new PizzaCommand());
        server.makeOrder();

        server.setOrder(new SpaghettiCommand());
        server.makeOrder();
    }
}