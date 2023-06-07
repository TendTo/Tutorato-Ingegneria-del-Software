class Main {
    public static void main(String[] args) {
        Hype hype = new Hype();
        Client a = new Client(0);
        Client b = new Client(1);

        hype.attach(a);
        hype.attach(b);

        System.out.println("Deposit");
        hype.deposit(0, 10);
        hype.deposit(1, 15);

        System.out.println("Withdraw");
        hype.withdraw(0, 16);
        hype.withdraw(1, 10);
        
        System.out.println("On change");
        hype.onChange();
        hype.detach(b);
        hype.deposit(1, 10);

        hype.detach(b);

    }
}