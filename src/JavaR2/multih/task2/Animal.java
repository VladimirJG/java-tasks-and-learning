package JavaR2.multih.task2;

public class Animal extends Thread{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("I`m " + this.name);
    }
}
