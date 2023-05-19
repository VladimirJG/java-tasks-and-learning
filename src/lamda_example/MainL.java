package lamda_example;

import java.util.Comparator;
import java.util.List;

public class MainL {
    public static void main(String[] args) {


    }
    public static List<Book> doWithoutLambda(List<Book> books) {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIssueYear().compareTo(o2.getIssueYear());
            }
        });
        return books;
    }
}
