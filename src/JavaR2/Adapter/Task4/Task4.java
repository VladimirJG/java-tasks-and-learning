package JavaR2.Adapter.Task4;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//Адаптировать Scanner к PersonScanner.
//Классом-адаптером является PersonScannerAdapter.
//В классе адаптере создать приватное финальное поле Scanner fileScanner.
// Поле инициализировать в конструкторе с одним аргументом типа Scanner.
//
//Данные в файле хранятся в следующем виде:
//Иванов Иван Иванович 31 12 1950
//Петров Петр Петрович 31 12 1957
//
//В файле хранится большое количество людей, данные одного человека находятся в одной строке.
// Метод read() должен читать данные только одного человека.
//
//Требования:
//•	PersonScanner должен быть интерфейсом.
//•	Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
//•	Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
//•	Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
//•	Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
//•	Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её,
// и возвращать данные только одного человека, в виде объекта класса Person.
public class Task4 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner fileScanner = new Scanner("Иванов Иван Иванович 31 12 1950\n" +
                "Петров Петр Петрович 31 12 1957");
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(fileScanner);
        System.out.println(personScannerAdapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String s = fileScanner.nextLine();
            String[] s1 = s.split(" ");

            SimpleDateFormat originalFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = originalFormat.parse(s1[3]+" "+ s1[4]+" "+s1[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            return new Person(s1[1] + "", s1[2] + "", s1[0] + "", date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
