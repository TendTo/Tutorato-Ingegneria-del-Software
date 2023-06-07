import java.util.List;

public class Meal {
    private List<String> ingredients;
    private String name;

    public Meal(List<String> ingredients, String name) {
        this.ingredients = ingredients;
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
