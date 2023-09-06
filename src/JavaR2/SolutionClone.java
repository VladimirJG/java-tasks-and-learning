package JavaR2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class SolutionClone implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        SolutionClone solution = new SolutionClone();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        SolutionClone clone = null;
        clone = solution.clone();
        System.out.println(solution);
        System.out.println(clone);

        System.out.println(solution.users);
        System.out.println(clone.users);

    }

    protected Map<String, User> users = new LinkedHashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolutionClone clone = (SolutionClone) o;
        return Objects.equals(users, clone.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public SolutionClone clone() {
        try {
            return (SolutionClone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public User clone() {
            try {
                return (User) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
