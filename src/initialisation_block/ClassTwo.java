package initialisation_block;

public class ClassTwo extends ClassOne {
    private String name;
    private int num;

    {
        System.out.println("no name initialisation block ClassTwo");
    }

    static {
        System.out.println("static initialisation block ClassTwo");
    }


    public ClassTwo(String name, int num) {
        super(name, num);
        System.out.println("Constructor ClassTwo");
    }
}
