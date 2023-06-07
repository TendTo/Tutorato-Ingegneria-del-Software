public class Kitchen {
    private static Kitchen instance;
    public static Kitchen getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    public void putInTheOven(Meal meal) {
        System.out.println("Metto '" + meal.getName() + "' nel forno");
    }

    public void takeOutOfTheOven(Meal meal) {
        System.out.println("Tolgo '" + meal.getName() + "' dal forno");
    }

    public void cook(Meal meal) {
        System.out.println("Cucino '" + meal.getName() + "'");
    }

    public void announceIsReady(Meal meal) {
        System.out.println("'" + meal.getName() + "' è pronto");
    }
}
