package AlgorithmsAndDataStructures.test;

public class DistanceToGasStation {
    public static void main(String[] args) {
        int[] distanceToThePark = new int[]{0, 200, 375, 550, 750, 950, 1500, 1550};
        int possibleToTravel = 400;
        System.out.println("stops done: " + numberOfStops(possibleToTravel, distanceToThePark));
    }

    private static int numberOfStops(int possibleToTravel, int[] distanceToThePark) {
        int stopsCount = 0;
        int passed = possibleToTravel;
        for (int i = 0; i < distanceToThePark.length - 1; i++) {
            if (distanceToThePark[i + 1] > passed) {
                if (distanceToThePark[i] <= passed && (distanceToThePark[i + 1] - distanceToThePark[i]) <= possibleToTravel) {
                    passed = possibleToTravel + distanceToThePark[i];
                    stopsCount++;
                } else {
                    System.out.println("next gas station not available " + distanceToThePark[i + 1]);
                    break;
                }
            }
        }
        return stopsCount;
    }
}
