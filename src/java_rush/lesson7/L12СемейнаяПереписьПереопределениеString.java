package java_rush.lesson7;

//Создай класс Human с полями имя(String), пол(boolean),
// возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
// Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//
//Примечание:
//Если написать свой метод String toString() в классе Human,
// то именно он будет использоваться при выводе объекта на экран.
public class L12СемейнаяПереписьПереопределениеString {
    public static void main(String[] args) {
        //Grand
        Human jonnyGD1 = new Human("Jonn MF Connor", true, 85);
        Human mikhaelGD2 = new Human("Mikhael Vitalievich Ponomarev", true, 73);
        Human inessaGM1 = new Human("Inessa Eduardovna Connor-Manufacturova", false, 68);
        Human ekaterinaGM2 = new Human("Ekaterina Vasilievna Ponomareva", false, 72);

        //Parents
        Human victorD = new Human("Victor Jonovich Connor-Manufacturov", true, 43, jonnyGD1, inessaGM1);
        Human paulinaM = new Human("Paulina Mikhaelovna Ponomareva - Connor - Manufacturova", false, 39, mikhaelGD2, ekaterinaGM2);

        //Children
        Human sanya = new Human("Aleksandr Victorovich Ponomarev - Connor - Manufacturov", true, 19, victorD, paulinaM);
        Human kolia = new Human("Nikolai Victorovich Ponomarev - Connor - Manufacturov", true, 15, victorD, paulinaM);
        Human tania = new Human("Tatiana Victorovna Ponomareva - Connor - Manufacturova", true, 11, victorD, paulinaM);

        System.out.println(kolia);
        System.out.println(jonnyGD1);
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
