package java_rush.Lesson3;

/*Создать 5 зергов, 3 протосса и 4 террана.
        Дать им всем уникальные имена.*/
public class L3L4StarCraft {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
