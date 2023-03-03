package java_rush.lesson6;

//Задача: У каждой кошки есть имя и кошка-мама.
//Создать класс, который бы описывал данную ситуацию.
//Создать два объекта: кошку-дочь и кошку-маму.
//Вывести их на экран.
//
//Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
//Изменить класс Cat так, чтобы он мог описать данную ситуацию.
//Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
//Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
public class L11РодственныеСвязи {
    public static void main(String[] args) {
        CatGrandParent grandParent = new CatGrandParent("GrandDad", "GrandMam");
        CatParent parent = new CatParent("Dad", "Mam");
        Cat cat = new Cat("Child",parent.nameDad,parent.nameMam,grandParent.nameGrandDad,grandParent.nameGrandMam);
        System.out.println(grandParent.nameGrandDad);
        System.out.println(grandParent.nameGrandMam);
        System.out.println(parent.nameDad);
        System.out.println(parent.nameMam);
        System.out.println(cat.name);
    }

    public static class Cat {
        private String name;
        private String nameDad;
        private String nameMam;
        private String nameGrandDad;
        private String nameGrandMam;

        public Cat(String name, String nameDad, String nameMam, String nameGrandDad, String nameGrandMam) {
            this.name = name;
            this.nameDad = nameDad;
            this.nameMam = nameMam;
            this.nameGrandDad = nameGrandDad;
            this.nameGrandMam = nameGrandMam;
        }
    }

    public static class CatParent {
        private String nameDad;
        private String nameMam;

        public CatParent(String nameDad, String nameMam) {
            this.nameDad = nameDad;
            this.nameMam = nameMam;
        }
    }

    public static class CatGrandParent {
        private String nameGrandDad;
        private String nameGrandMam;

        public CatGrandParent(String nameGrandDad, String nameGrandMam) {
            this.nameGrandDad = nameGrandDad;
            this.nameGrandMam = nameGrandMam;
        }
    }
}
//Решение JR
/*
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String grandpaName = reader.readLine();
    Cat catGrandpa = new Cat(grandpaName);

    String grandmaName = reader.readLine();
    Cat catGrandma = new Cat(grandmaName);

    String fatherName = reader.readLine();
    Cat catFather = new Cat(fatherName, catGrandpa, null);

    String motherName = reader.readLine();
    Cat catMother = new Cat(motherName, null, catGrandma);

    String sonName = reader.readLine();
    Cat catSon = new Cat(sonName, catFather, catMother);

    String daughterName = reader.readLine();
    Cat catDaughter = new Cat(daughterName, catFather, catMother);

    System.out.println(catGrandpa);
    System.out.println(catGrandma);
    System.out.println(catFather);
    System.out.println(catMother);
    System.out.println(catSon);
    System.out.println(catDaughter);
}

public static class Cat {
    private String name;
    private Cat father;
    private Cat mother;

    Cat(String name) {
        this.name = name;
    }

    public Cat(String name, Cat father, Cat mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        if (father == null) {
            if (mother == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            }
        } else {
            if (mother == null) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}*/
