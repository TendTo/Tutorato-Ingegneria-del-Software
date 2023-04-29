public class Character {
    private int damage;
    private CharacterState state;

    public Character(){
        state = new NormalCharacterState();
        damage = 100;
    }

    public void attack(){
        state = state.attack(damage);
    }

    public void useSkill(){
        state = state.useSkill();
    }

    public void drinkPotion(){
        state = state.potion();
    }
}
