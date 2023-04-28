package dmdev.oop.lesson8;

public class Computer {

    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState(){
        System.out.println("Ram = " + ram.getValue() + ", " + "Ssd = " + ssd.getSsdValue());
    }
}
