package sinergy.modul_3.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PhoneRunner {
    public static void main(String[] args) {
        List<Phone> phones = Arrays.asList(
                new Phone("Nokia", "TOR 12", 12_500),
                new Phone("Nokia", "Garant 54", 13_689),
                new Phone("Nokia", "Serano", 46_000),
                new Phone("Samsung", "G 56", 56_000),
                new Phone("Samsung", "A 20", 24_000),
                new Phone("Samsung", "UJ 98", 17_063),
                new Phone("Apple", "A 1", 158_000),
                new Phone("Apple", "Mapl", 2_000_580),
                new Phone("Apple", "Guepl", 25_000));
        System.out.println("Весь ассортимент");
        for (Phone phone : phones) {
            System.out.println(phone);
        }
        System.out.println("Производитель Samsung");
        List<Phone> samsung = getModelsManufacturer(phones, "Samsung");
        for (Phone phone :
                samsung) {
            System.out.println(phone);
        }

        System.out.println("Отсортированный по цене");
        phones.sort(Comparator.comparing(Phone::getPrice));
        for (Phone phone : phones) {
            System.out.println(phone);
        }

    }

    public static List<Phone> getModelsManufacturer(List<Phone> phone, String manufacturersName) {
        return phone.stream().filter(s -> s.getManufacturersName().equals(manufacturersName)).toList();
    }
}
