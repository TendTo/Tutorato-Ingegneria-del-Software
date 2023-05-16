
public class Main {
    public static void main(String[] args) {
        Animal duck = new Animal();
        duck = new FlyingAnimal(duck);
        duck = new SwimmingAnimal(duck);
        duck = new WalkingAnimal(duck);
        
        System.out.println("Papera");
        System.out.println("Nuota?: " + duck.can(Action.SWIM));
        System.out.println("Cammina?: " + duck.can(Action.WALK));
        System.out.println("Vola?: " + duck.can(Action.FLY));
        
        Animal dog = new Animal();
        dog = new WalkingAnimal(dog);
        
        System.out.println("Cane");
        System.out.println("Nuota?: " + dog.can(Action.SWIM));
        System.out.println("Cammina?: " + dog.can(Action.WALK));
        System.out.println("Vola?: " + dog.can(Action.FLY));
        
        Animal fish = new Animal();
        fish = new SwimmingAnimal(fish);

        System.out.println("Pesce");
        System.out.println("Nuota?: " + fish.can(Action.SWIM));
        System.out.println("Cammina?: " + fish.can(Action.WALK));
        System.out.println("Vola?: " + fish.can(Action.FLY));

        Animal mosquito = new Animal();
        mosquito = new DeadAnimal(mosquito);

        System.out.println("Zanzara");
        System.out.println("Mangia?: " + mosquito.can(Action.EAT));
    }
}
