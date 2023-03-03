package java_rush.lesson8_collections;

import java.util.HashSet;
import java.util.Set;

//1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или
// с конструктором без параметров.
//2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
//3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
//4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
//5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
//6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
//Каждое животное с новой строки.
//
//Требования:
//•	Программа должна выводить текст на экран.
//•	Внутри класса Solution должны быть созданы public static классы Cat, Dog.
//•	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
//•	Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
//•	Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
//•	Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
//•	Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
public class L8МножестваЖивотных {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDog();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("==================================");
        removeCats(pets,cats);
        printPets(pets);

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static Set<Cat> createCats() {
        Set<Cat> catList = new HashSet<>();
        catList.add(new Cat());
        catList.add(new Cat());
        catList.add(new Cat());
        catList.add(new Cat());

        return catList;
    }

    public static Set<Dog> createDog() {
        Set<Dog> dogList = new HashSet<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog());

        return dogList;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }
}
