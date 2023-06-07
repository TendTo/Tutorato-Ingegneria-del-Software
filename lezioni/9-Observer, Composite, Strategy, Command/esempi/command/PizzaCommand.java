import java.util.List;

public class PizzaCommand extends PrepareMealCommand {
    @Override
    public void execute() {
        Meal pizza = new Meal(List.of("dough", "tomato sauce", "cheese"), "pizza");
        kitchen.putInTheOven(pizza);
        kitchen.takeOutOfTheOven(pizza);
        kitchen.announceIsReady(pizza);
    }
}
