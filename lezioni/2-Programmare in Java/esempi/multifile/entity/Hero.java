package entity;

public class Hero extends Character {

    public Hero(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    public void attack(Damageable target) {
        target.damage(attack);
    }

    @Override
    public void damage(int damage) {
        this.currentHealth = Math.max(0, this.currentHealth - damage);
        if (this.currentHealth <= 0) {
            this.die();
        } else {
            System.out.println("The " + name + " has " + currentHealth + " health left.");
        }
    }

    @Override
    public void die() {
        System.out.println(this.name + " has died. Game Over.");
    }
}
