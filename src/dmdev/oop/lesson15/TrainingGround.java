package dmdev.oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Archy");
        /* hero1.attackEnemy();*/

        Hero warrior1 = new Warrior("Воин Джун");
        Hero mage1 = new Mage("Маг Магомед");
        Hero archer1 = new Archer("Лучник Илья");
        Enemy enemy = new Enemy("Гоблин", 100);


       /* warrior1.attackEnemy();
        mage1.attackEnemy();
        archer1.attackEnemy();*/

        attackEnemy(enemy, warrior1, archer1, mage1);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
