package entity;

public abstract class Character extends Entity implements Damageable {
    protected int currentHealth;
    protected int maxHealth;
    protected int attack;
    protected int defense;

    public Character(String name, int health, int attack, int defense) {
        super(name);
        this.maxHealth = health;
        this.currentHealth = health;
        this.attack = attack;
        this.defense = defense;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public abstract void attack(Damageable target);
    public abstract void die();

    public void interact(Interactable lightSwitch) {
        lightSwitch.interact();
    }
}
