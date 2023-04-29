public interface CharacterState {
    public CharacterState attack(int damage);
    public CharacterState useSkill();
    public CharacterState potion();
}
