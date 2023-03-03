package java_rush_java_core.lesson_4;
//В этой задаче тебе нужно:
//Правильно расставить наследование между Building (здание) и School (здание школы).
//Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
//Изменить null на объект класса Building или School.
//Сигнатуры методов getSchool() и getBuilding() не меняй.
//
//Требования:
//•	Класс School должен наследоваться от класса Building.
//•	Метод getSchool() должен возвращать новую школу (School).
//•	Метод getBuilding() должен возвращать новое здание (Building).
//•	Класс School должен быть статическим.
//•	Класс Building должен быть статическим
public class L4_1 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School

        return new School();
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building  {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
