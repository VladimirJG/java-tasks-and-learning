package initialisation_block;

public class ClassOne {
    private String name;
    private int num;

    {
        System.out.println("no name initialisation block ClassOne");
    }

    static {
        System.out.println("static initialisation block ClassOne");
    }

    public ClassOne(String name, int num) {
        this.name = name;
        this.num = num;
        System.out.println("Constructor ClassOne");
    }

}
