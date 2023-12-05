package tin.eternal_contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amtPeople = scanner.nextInt();
        int timeOffOnePerson = scanner.nextInt();
        List<Integer> floors = new ArrayList<>();
        for (int i = 0; i < amtPeople; i++) {
            floors.add(scanner.nextInt());
        }
        int personOutFloor = scanner.nextInt();

        boolean timeOutPersonMoreFloorPersonOut = timeOffOnePerson >= personOutFloor;
        if (timeOutPersonMoreFloorPersonOut)
            System.out.println(floors.get(floors.size() - 1) - floors.get(0));
        else {
            System.out.println(moreOrLess(floors, personOutFloor));
        }
    }

    public static int moreOrLess(List<Integer> floors, int personOutFloor) {
        floors.add(personOutFloor);
        Collections.sort(floors);
        int left = floors.get(floors.indexOf(personOutFloor)) - floors.get(0);
        int right = floors.get(floors.size() - 1) - floors.get(floors.indexOf(personOutFloor));
        boolean leftMoreRight = left >= right;
        if (!leftMoreRight)
            return left + (floors.get(floors.size() - 1) - floors.get(0));
        else
            return (floors.get(floors.size() - 1) - floors.get(0)) + right;
    }
}
