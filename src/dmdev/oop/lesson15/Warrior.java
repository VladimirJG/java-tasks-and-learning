package dmdev.oop.lesson15;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " бьет булавой по " + enemy.getName());
    }
}
