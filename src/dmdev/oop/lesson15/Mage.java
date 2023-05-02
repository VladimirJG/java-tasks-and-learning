package dmdev.oop.lesson15;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " создает заклинание против " + enemy.getName());
    }
}
