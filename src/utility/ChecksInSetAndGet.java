package utility;

public class ChecksInSetAndGet {
//Person
    private String name;
    private int age;

    public ChecksInSetAndGet(String name, int age) {//Person
        checkName(name);
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    private void checkAge(final int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative");
        }
    }

    private void checkName(final String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }
}


