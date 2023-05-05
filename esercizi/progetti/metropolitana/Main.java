import bank.Bank;
import metro.ITicket;
import metro.ITurnstile;
import metro.MetroEntrance;
import metro.ITicket.TicketType;
import user.User;

public class Main {
    public static void main(String[] args) {
        User mario = new User("Mario");
        User luigi = new User("Luigi");

        Bank bank = Bank.getInstance();
        bank.addAccount(mario, 5);
        bank.addAccount(luigi, 2);

        MetroEntrance metroEntrance = MetroEntrance.getInstance();
        ITurnstile turnstile;

        // Mario e Luigi comprano il biglietto
        ITicket marioTicket = metroEntrance.getVendingMachine().buyTicket(mario, TicketType.PREMIUM);
        mario.setTicket(marioTicket);

        ITicket luigiTicket = metroEntrance.getVendingMachine().buyTicket(luigi, TicketType.STANDARD);
        luigi.setTicket(luigiTicket);
        
        turnstile = metroEntrance.getTurnstile();

        // Mario si è dimenticato di convalidare il biglietto
        turnstile.insertTicket(mario.getTicket());
        turnstile.goThrough(mario);

        // Luigi convalida il biglietto e passa
        luigi.validateTicket();
        turnstile.insertTicket(luigi.getTicket());
        turnstile.goThrough(luigi);

        // Mario prova a passare nuovamente facendosi prestare il biglietto già usato di
        // Luigi
        turnstile.insertTicket(luigi.getTicket());
        turnstile.goThrough(mario);

        // Mario si accorge che il biglietto è già stato usato e prova a passare con il
        // suo, convalidandolo
        mario.validateTicket();
        turnstile.insertTicket(mario.getTicket());
        turnstile.goThrough(mario);

        // Dopo aver fatto la loro vacanza, Mario e Luigi tornano a casa, ma Luigi non
        // ha abbastanza soldi per comprare un biglietto premium, quindi si accontenta
        // di uno standard
        metroEntrance.getVendingMachine().buyTicket(mario, TicketType.PREMIUM);
        metroEntrance.getVendingMachine().buyTicket(luigi, TicketType.PREMIUM);
        metroEntrance.getVendingMachine().buyTicket(luigi, TicketType.STANDARD);

        // Mario e Luigi convalidano i biglietti e passano
        mario.validateTicket();
        luigi.validateTicket();
        turnstile.insertTicket(mario.getTicket());
        turnstile.goThrough(mario);
        turnstile.insertTicket(luigi.getTicket());
        turnstile.goThrough(luigi);
    }
}
