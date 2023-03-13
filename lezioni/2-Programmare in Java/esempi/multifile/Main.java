import java.util.ArrayList;
import java.util.List;

import entity.Character;
import entity.Damageable;
import entity.Enemy;
import entity.Entity;
import entity.Ghost;
import entity.Hero;
import entity.Interactable;
import entity.LightSwitch;
import entity.Orc;

public class Main {
    public static void main(String args[]) {
        Character hero = new Hero("Hero", 100, 10, 5);
        List<Entity> entities = new ArrayList<>();
        entities.add(new LightSwitch());
        entities.add(new Orc());
        entities.add(new Ghost());

        // Loop over all the entities the heroes meets and interact with them
        // accordingly
        for (Entity entity : entities) {
            if (entity instanceof Interactable interactable) {
                interactable.interact();
            }
            if (entity instanceof Damageable damageable) {
                hero.attack(damageable);
            }
            if (entity instanceof Enemy enemy) {
                if (enemy.isAlive())
                    enemy.attack(hero);
            }
        }
    }
}