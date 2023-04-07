package JavaR2.exception_end10;

//Напиши класс Human с 6 полями.
//Придумай и реализуй 10 различных конструкторов для него.
public class Task1ClassWith10Methods {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private String colorEyes;
        private int height;
        private int weight;
        private int age;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, String colorEyes) {
            this.name = name;
            this.lastName = lastName;
            this.colorEyes = colorEyes;
        }

        public Human(String name, String lastName, String colorEyes, int height) {
            this.name = name;
            this.lastName = lastName;
            this.colorEyes = colorEyes;
            this.height = height;
        }

        public Human(String name, String lastName, String colorEyes, int height, int weight) {
            this.name = name;
            this.lastName = lastName;
            this.colorEyes = colorEyes;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String lastName, String colorEyes, int height, int weight, int age) {
            this.name = name;
            this.lastName = lastName;
            this.colorEyes = colorEyes;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }

        public Human(String name, int height, String lastName, String colorEyes) {
            this.name = name;
            this.lastName = lastName;
            this.colorEyes = colorEyes;
            this.height = height;
        }

        public Human(String name, int height, String colorEyes) {
            this.name = name;
            this.colorEyes = colorEyes;
            this.height = height;
        }

        public Human(int height, String lastName, String colorEyes) {
            this.lastName = lastName;
            this.colorEyes = colorEyes;
            this.height = height;
        }
    }
}
