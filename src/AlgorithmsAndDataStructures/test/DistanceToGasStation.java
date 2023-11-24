package AlgorithmsAndDataStructures.test;

public class DistanceToGasStation {
    public static void main(String[] args) {
        int[] distanceToThePark = new int[]{200, 375, 550, 750, 950};
        int possibleToTravel = 400;
        System.out.println(numberOfStops(possibleToTravel,distanceToThePark));
    }

    private static int numberOfStops(int possibleToTravel, int[] distanceToThePark) {
        int stopsCount = 0;
        for (int i = 0; i < distanceToThePark.length; i++) {
            if (distanceToThePark[i] > possibleToTravel) {
                possibleToTravel = possibleToTravel + distanceToThePark[i - 1];
                stopsCount++;
            }
        }
        return stopsCount;
    }
}
