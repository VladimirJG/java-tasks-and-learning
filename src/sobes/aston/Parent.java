package sobes.aston;

class Parent{
    static void test(){
        System.out.println("Метод из Parent");
    }
}
class Child extends Parent{
    static void test(){
        System.out.println("Метод из Child");
    }
}
 class Tests {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.test();
        childAsParent.test();
        child.test();
    }
}