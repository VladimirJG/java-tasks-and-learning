package java_rush.lesson2;

import java.util.Arrays;

public class Artifact {
    String className;
    String color;
    String name;
    int number;
    int year;

    static int count = 0;
    public Artifact(String className, String name, int number, int year, String color){
        this.className = className;
        this.name = name;
        this.number = number;
        this.year = year;
        this.color = color;
    }
    public Artifact(){
        count++;
        this.name = "Неизвестный артифакт " + count;
    }
    public Artifact(String color, int number){
        this.color = color;
        this.number = number;
    }

    public static void main(String[] args) {
        Artifact mummy = new Artifact("mummy","Tutonhomon",25,-1985,"red");
        Artifact artifact1 = new Artifact();
        Artifact painting = new Artifact("blue",18);

        System.out.println(mummy.name);
        System.out.println(artifact1.name);
        System.out.println(painting.color);

    }
}
