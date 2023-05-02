package dmdev.oop.lesson15;

public class Hero {
    private String name;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует врага" + enemy.getName());
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
