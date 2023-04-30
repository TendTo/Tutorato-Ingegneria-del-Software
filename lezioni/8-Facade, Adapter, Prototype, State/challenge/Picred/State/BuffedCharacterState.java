public class BuffedCharacterState implements CharacterState {
    
    @Override
    public CharacterState attack(int damage){
        damage += 100;
        System.out.println("Ho attaccato un nemico con un danno di " + damage);
        return this;
    }


    @Override
    public CharacterState useSkill(){
        System.out.println("Ho usato una skill");
        return new StunnedCharacterState();
    }


    @Override
    public CharacterState potion(){
        System.out.println("Ho bevuto una pozione");
        return this;
    }
}
