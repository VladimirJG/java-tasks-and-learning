package sinergy.modul_3.task1_generic;

//Создайте абстрактный класс с именем Metal, создайте и унаследуйте от него такие материалы как steel, copper, iron.
//В классе Metal нужен метод getEndurance, реализуйте его так,
// чтобы в классе steel этот метод возвращал значение 50, в iron – 30, а в copper 20.
//Создайте так же класс Plastic который не является подклассом класса Metal.
//Создайте класс Sword, используя дженерики обеспечьте типобезопасность таким образом,
// чтобы меч можно было создать используя любой материал, кроме пластика(Plastic).
//В классе Sword создайте метод, который возвращает true, если меч прошёл проверку прочности и false,
// если не прошёл. Используйте метод getEndurance.
//Чтобы меч прошёл проверку прочности его прочность должна быть строго больше 49.
//В классе Test создайте метод main и протестируйте ваше решение.
//- У вас не должно получиться создать экземпляр меча используя пластик.
//- Создайте меч используя steel
//- Выведите на экран прошёл ли меч проверку прочности.
public class Test {
    public static void main(String[] args) {

        Sword<Steel> steelSword = new Sword<>();
        Sword<Iron> ironSword = new Sword<>();
        Sword<Plastic> plasticSword = new Sword<>();

        Steel steel = new Steel();
        System.out.println(steelSword.strengthTest(steel.getEndurance()));

        Iron iron = new Iron();
        System.out.println(ironSword.strengthTest(iron.getEndurance()));

        Plastic plastic = new Plastic();

    }
}
