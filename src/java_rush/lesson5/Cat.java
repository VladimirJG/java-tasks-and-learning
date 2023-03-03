package java_rush.lesson5;
//Реализуй метод boolean fight(Cat anotherCat):
//продумай механизм драки котов в зависимости от их веса, возраста и силы.
//Сравни каждый критерий по отдельности, чтобы победителем был тот,
// у кого были лучшие показатели по большинству критериев.
//Метод должен определять, выиграли ли мы (this) бой или нет,
// т.е. возвращать true, если выиграли и false - если проиграли.
//Если ничья и никто не выиграл, возвращаем false.
public class Cat {
    String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int scoreAge = anotherCat.age > this.age ? 0 : 1;
        int scoreStrength = anotherCat.strength > this.strength ? 0 : 1;
        int scoreWeight = anotherCat.weight > this.weight ? 0 : 1;
        int end = scoreWeight + scoreStrength + scoreAge;
        return end > 1;

        //Решение JR
        /*int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0;*/
    }

    public static void main(String[] args) {
        Cat barsic = new Cat();
        barsic.weight = 5;
        barsic.age= 2;
        barsic.strength = 3;

        Cat vasyn = new Cat();
        vasyn.age = 5;
        vasyn.weight = 1;
        vasyn.strength = 1;

        System.out.println(barsic.fight(vasyn));
    }
}
