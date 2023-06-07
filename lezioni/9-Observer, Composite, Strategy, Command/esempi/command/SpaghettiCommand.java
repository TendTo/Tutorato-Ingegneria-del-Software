import java.util.List;

public class SpaghettiCommand extends PrepareMealCommand {
    @Override
    public void execute() {
        Meal pizza = new Meal(List.of("pasta", "tomatoes", "cheese"), "spaghetti");
        kitchen.cook(pizza);
        kitchen.announceIsReady(pizza);
    }
}
