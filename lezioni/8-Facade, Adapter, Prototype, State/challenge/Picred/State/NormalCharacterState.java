public class NormalCharacterState implements CharacterState {
    
    @Override
    public CharacterState attack(int damage){
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
        System.out.println("Ho bevuto una pozione per potenziarmi");
        return new BuffedCharacterState();
    }
}
