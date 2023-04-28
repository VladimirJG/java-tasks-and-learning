package dmdev.oop.lesson8;

public class ComputerRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(500);
        Ssd ssd = new Ssd(800);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }

}
