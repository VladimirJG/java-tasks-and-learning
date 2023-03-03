package java_rush.lesson5;

//1. Внутри класса Solution создай public static классы Man и Woman.
//2. У классов должны быть поля: name (String), age (int), address (String).
//3. Создай конструкторы, в которые передаются все возможные параметры.
//4. Создай по два объекта каждого класса со всеми данными используя конструктор.
//5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
public class L12СозданиеКлассов {
    public static void main(String[] args) {
        Man man1 = new Man("Vasya", 15, "Astrakhan");
        System.out.println(man1);
        Man man2 = new Man("Sania" , 28, "Biribidjan");
        System.out.println(man2);

        Woman woman1 = new Woman("Genia", 21,"Kenia");
        System.out.println(woman1);
        Woman woman2 = new Woman("Galina", 17, "Yalta");
        System.out.println(woman2);

    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man() {

        }

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
           return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman() {

        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return (name + " " + age + " " + address);
        }
    }
}
