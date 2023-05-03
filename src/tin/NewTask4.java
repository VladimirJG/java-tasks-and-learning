package tin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewTask4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfSymbol = Integer.parseInt(reader.readLine());
        String stringOfSymbol = reader.readLine();

        System.out.println(calculateLengthOfBoringArray(countTheIdenticalNumbers(getAnArrayOfNumber(countOfSymbol, stringOfSymbol))));
    }

    public static int[] getAnArrayOfNumber(int length, String numbers) {
        String[] stringArrayOfNumbers = numbers.split(" ");
        int[] intArrayOfNumbers = new int[stringArrayOfNumbers.length];
        for (int i = 0; i < stringArrayOfNumbers.length; i++) {
            intArrayOfNumbers[i] = Integer.parseInt(stringArrayOfNumbers[i]);
        }
        return intArrayOfNumbers;
    }

    public static int[] countTheIdenticalNumbers(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        int count = 0;
        int[] newArray = new int[arrayOfNumbers.length];
        for (int i = 0, j = 0; i < arrayOfNumbers.length - 1; i++) {
            if (arrayOfNumbers[i] == arrayOfNumbers[i + 1]) {
                count++;
            } else if (arrayOfNumbers[i] + 1 == arrayOfNumbers[i + 1]) {
                count++;
                newArray[j] = count;
                count = 0;
                j++;
            } else {
                count++;
                newArray[j] = count;
                count = 0;
                j++;
            }
        }
        return newArray;
    }

    public static int calculateLengthOfBoringArray(int[] newArray) {
        int lengthArray = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            if (newArray[i] == newArray[i + 1]) {
                lengthArray += newArray[i];
            } else if (newArray[i] + 1 == newArray[i + 1]) {
                lengthArray += newArray[i];
                lengthArray += newArray[i + 1];
                newArray[i + 1] -= 1;
            } else {
                break;
            }
        }
        return lengthArray;
    }
}
