public class Player {
    public static void main(String[] args) {
        Character pg = new Character();

        pg.attack(); //normal state

        pg.drinkPotion(); //buffed

        pg.attack();

        pg.useSkill(); //stunned
        
        pg.attack();

        pg.drinkPotion(); //normal

        pg.useSkill(); //stunned

        pg.attack();
    }
}