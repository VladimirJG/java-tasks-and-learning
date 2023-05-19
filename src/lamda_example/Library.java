package lamda_example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Ruman", "O jizni", 1958));
        books.add(new Book("Dart Veyder", "Zlo v pole", 2578));
        books.add(new Book("U. Kuklachev", "Cats & sex", 2007));
        books.add(new Book("Pernati Mish", "Zerna v Podvale", 1834));
        books.add(new Book("Parno Kopitni", "Milk or vodka", 1985));
        books.add(new Book("Panin ml.", "Puhli zad sobaki", 2018));
        books.add(new Book("boroda v hidjabe", "kak bejat s bomboi", 1967));
        books.add(new Book("Borman", "stirlic in my world", 1943));
        books.add(new Book("Stirlic", "Gitler caput", 1941));
        books.add(new Book("gitler", "My pump", 1944));
        books.add(new Book("Chukch", "Pro oleney", 1723));
        //и так далее для других книг

        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Петров Петр", "iзуекv.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        //и так далее для других читателей

        readers.get(0).getBooks().add(books.get(1));
        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
