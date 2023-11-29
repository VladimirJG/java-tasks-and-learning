package tin.test;

import java.time.LocalDate;
import java.util.*;

public class Winner {
    public static void main(String[] args) {
        int numberOfYears = 9;
        numberOfVictories(numberOfYears);

    }

    public static void numberOfVictories(int numberOfYears) {
        Map<Command, Integer> map = new HashMap<>();
        sortedByYearAndName(numberOfYears).forEach((k, v) -> map.merge(v, map.getOrDefault(v, 1), (a, b) -> b + 1));
        System.out.println(map);
    }

    public static Map<Integer, Command> sortedByYearAndName(int numberOfYears) {
        Map<Integer, Command> winner = winnerTeamByYear();
        winner.keySet().removeIf(year -> year <= (LocalDate.now().getYear() - numberOfYears));
        for (Map.Entry<Integer, Command> entry : winner.entrySet()) {
            Command com = entry.getValue();
            List<String> list = new ArrayList<>();
            list.add(com.getName1());
            list.add(com.getName2());
            list.add(com.getName3());
            Collections.sort(list);
            com.setName1(list.get(0));
            com.setName2(list.get(1));
            com.setName3(list.get(2));
            entry.setValue(com);
        }
        return winner;
    }

    public static Map<Integer, Command> winnerTeamByYear() {
        Map<Integer, Command> map = new TreeMap<>();
        map.put(2018, new Command("Pres", "Bolt", "Mike"));
        map.put(2015, new Command("Marfa", "Tom", "Boris"));
        map.put(2016, new Command("Boris", "Alex", "Marfa"));
        map.put(2021, new Command("Boris", "Alex", "Marfa"));
        map.put(2020, new Command("Alex", "Dina", "Molly"));
        map.put(2022, new Command("Alex", "Dina", "Molly"));
        map.put(2023, new Command("Alex", "Dina", "Molly"));
        map.put(2019, new Command("Semen", "Ghanny", "Yaya"));
        map.put(2017, new Command("Vlad", "Ted", "Nik"));
        return map;
    }

    public static class Command {
        private String name1;
        private String name2;
        private String name3;

        public Command(String name1, String name2, String name3) {
            this.name1 = name1;
            this.name2 = name2;
            this.name3 = name3;
        }

        public String getName1() {
            return name1;
        }

        public String getName2() {
            return name2;
        }

        public String getName3() {
            return name3;
        }


        public void setName1(String name1) {
            this.name1 = name1;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        public void setName3(String name3) {
            this.name3 = name3;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Command command = (Command) o;
            return Objects.equals(name1, command.name1) && Objects.equals(name2, command.name2) && Objects.equals(name3, command.name3);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name1, name2, name3);
        }

        @Override
        public String toString() {
            return name1 + ", " + name2 + ", " + name3;
        }
    }
}
