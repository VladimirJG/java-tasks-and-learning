package dmdev.oop.lesson15;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println(name + " атакует врага");
    }

    public String getName() {
        return name;
    }


}
