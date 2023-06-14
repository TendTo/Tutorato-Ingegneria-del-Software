import java.util.List;

public class SpaghettiCommand extends PrepareMealCommand {
    @Override
    public void execute() {
        Meal spaghetti = new Meal(List.of("pasta", "tomatoes", "cheese"), "spaghetti");
        kitchen.cook(spaghetti);
        kitchen.announceIsReady(spaghetti);
    }
}
