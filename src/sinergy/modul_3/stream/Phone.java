package sinergy.modul_3.stream;

/**
 * Создайте собственный класс Phone, полями которого будут название производителя,
 * название модели и стоимость. Создайте ArrayList из нескольких объектов класса Phone.
 * С помощью Stream API создайте ArrayList моделей конкретного производителя.
 * Реализуйте интерфейс Comparable для класса Phone из предыдущего задания так,
 * чтобы модели сортировались по стоимости. С помощью StreamAPI
 * отсортируйте список объектов класса Phone и выведите названия моделей и стоимость.
 */
public class Phone {
    private String manufacturersName;
    private String modelsName;
    private int price;

    public Phone(String manufacturersName, String modelsName, int price) {
        this.manufacturersName = manufacturersName;
        this.modelsName = modelsName;
        this.price = price;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public String getModelsName() {
        return modelsName;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "manufacturersName='" + manufacturersName + '\'' +
                ", modelsName='" + modelsName + '\'' +
                ", price=" + price +
                '}';
    }
}
