package dmdev.oop.lesson15;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стреляет из лука в " +enemy.getName());
    }
}
