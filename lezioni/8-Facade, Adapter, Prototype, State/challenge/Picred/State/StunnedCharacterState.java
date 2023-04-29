public class StunnedCharacterState implements CharacterState{
    
    @Override
    public CharacterState attack(int damage){
        System.out.println("Non posso attaccare al momento.");
        return this;
    }


    @Override
    public CharacterState useSkill(){
        System.out.println("Non posso usare la skill");
        return this;
    }


    @Override
    public CharacterState potion(){
        System.out.println("Ho bevuto una pozione per riprendermi");
        return new NormalCharacterState();
    }
    
}
