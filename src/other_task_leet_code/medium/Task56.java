package other_task_leet_code.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Учитывая массив, intervals где , объедините все перекрывающиеся интервалы и
 верните массив непересекающихся интервалов, которые охватывают все
  интервалы во входных данных .intervals[i] = [starti, endi]
Пример 1:

Ввод: интервалы = [[1,3],[2,6],[8,10],[15,18]]
 Выход: [[1,6],[8,10],[15,18]]
 Пояснение: Поскольку интервалы [1,3] и [2,6] перекрываются, объедините их в [1,6].
Пример 2:

Ввод: интервалы = [[1,4],[4,5]]
 Выход: [[1,5]]
 Объяснение: Интервалы [1,4] и [4,5] считаются перекрывающимися.
 */
public class Task56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {5, 6}, {1, 3}, {2, 6}, {0, 4}, {8, 10}, {15, 18}};
        int[][] newIntervals = merge(intervals);
        for (int i = 0; i < newIntervals.length; i++) {
            System.out.println(Arrays.toString(newIntervals[i]));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> integers = new ArrayList<>();
        int[] interval = intervals[0];
        integers.add(interval);

        for (int i = 0; i < intervals.length; i++) {
            int endInterval = interval[1];
            int startNewInterval = intervals[i][0];
            int endNewInterval = intervals[i][1];

            if (endInterval>=startNewInterval){
                interval[1]= Math.max(endInterval,endNewInterval);
            }else {
                interval = intervals[i];
                integers.add(interval);
            }
        }

        return integers.toArray(new int[0][]);










       /* int j = 0;
        List<int[]> list1 = new ArrayList<>();
        if (!(intervals[0][1] >= intervals[1][0]) && !(intervals[0][1] <= intervals[1][1])) {
            list1.add(intervals[0]);

        }
        for (int i = 1; i < intervals.length; ) {
            if ((!list1.isEmpty()) && intervals[i][0] > list1.get(j - 1)[0] && intervals[i][1] < list1.get(j - 1)[1]) {
                i++;
            } else if (list.get(i - 1) >= intervals[i][0] && list.get(i - 1) <= intervals[i][1]) {
                int[] m = new int[]{intervals[i - 1][0], intervals[i][1]};
                list1.add(m);
                j++;
                i++;
            } else {
                list1.add(intervals[i]);
                i++;
            }
        }
        return list1.toArray(new int[0][]);*/
    }
}