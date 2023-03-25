package entity;

public class Orc extends Enemy {

    public Orc() {
        super("Orc", 100, 10, 5);
    }

    public Orc(int health) {
        super("Orc", health, 10, 5);
    }

    public Orc(int health, int attack, int defense) {
        super("Orc", health, attack, defense);
    }

    @Override
    public void attack(Damageable target) {
        target.damage(attack);
        target.damage(attack);
    }

    @Override
    public void damage(int damage) {
        if (damage < 3) {
            System.out.println("The damage tickles the " + name);
            return;
        }
        currentHealth = Math.max(0, currentHealth - damage);
        if (currentHealth <= 0) {
            die();
        } else {
            System.out.println("The " + name + " has " + currentHealth + " health left.");
        }
    }

    @Override
    public void die() {
        System.out.println(name + " has died.");
    }
}
