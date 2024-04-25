package tin.test24;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int numberOfGifts = 4;

        List<Present> presents = List.of(new Present(1, 2, 4),
                new Present(1, 2, 7),
                new Present(2, 2, 4),
                new Present(3, 1, 5));

        List<Integer> remainingDaysForShipping = new ArrayList<>();

        for (Present present : presents) {
            if (present.dayIn() + present.timeForWork() > present.dayOut()) {
                System.out.println("No");
                break;
            } else {
                int daysForShipping = present.dayOut() - (present.dayIn() + present.timeForWork());
                if (remainingDaysForShipping.contains(daysForShipping)) {
                    if (presents.get(presents.indexOf(daysForShipping) + 1).dayOut() == present.dayOut()) {
                        System.out.println("No");
                        break;
                    }
                } else {
                    remainingDaysForShipping.add(daysForShipping);
                }
            }
        }
        System.out.println("Yes");
    }
}

record Present(int dayIn, int timeForWork, int dayOut) {

    @Override
    public String toString() {
        return "Present{" +
                "dayIn=" + dayIn +
                ", timeForWork=" + timeForWork +
                ", dayOut=" + dayOut +
                '}';
    }
}

