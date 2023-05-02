package dmdev.oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Archy");
        hero1.attackEnemy();

        Warrior warrior1 = new Warrior("Воин Джун");
        Mage mage1 = new Mage("Маг Магомед");
        Archer archer1 = new Archer("Лучник Илья");

        warrior1.attackEnemy();
        mage1.attackEnemy();
        archer1.attackEnemy();
    }
}
