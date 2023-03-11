package entity;

public class Ghost extends Enemy {

    public Ghost() {
        super("Ghost", 1, 3, 0);
    }

    public Ghost(int attack) {
        super("Ghost", 1, attack, 0);
    }

    @Override
    public void attack(Damageable target) {
        target.damage(attack);
    }

    @Override
    public void die() {
        System.out.println(name + " has disappeared.");
    }

    @Override
    public void damage(int damage) {
        if (damage % 3 == 0) {
            System.out.println("The hit didn't seem to have any effect on " + name);
            return;
        }

        currentHealth = 0;
        die();
    }

}
