package JavaR2.multih.task1;

public class Printer implements Runnable {
    private String name;
    public Printer(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("I`m printer " + this.name);
    }
}
