package sinergy.modul_3.stream2;

import java.util.Optional;

public class StreamMain {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", Optional.of(new Address("Tagan", "Rog")));
        Student student2 = new Student("Sanya", Optional.of(new Address(null, null)));
        Student student3 = new Student("Olya", Optional.of(new Address("Kaz", "An`")));
        Student student4 = new Student("Gogy");
        Student student5 = new Student("Borusic");
        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
        printStudentInfo(student4);
        printStudentInfo(student5);

    }

    public static void printStudentInfo(Student student) {
        Optional<Address> address = student.getAddress();
        Optional<Optional<Address>> optionalAddress = Optional.ofNullable(address);
        System.out.print(student.getName());
        System.out.println(" ");
        optionalAddress.ifPresent(System.out::println);


    }
}
