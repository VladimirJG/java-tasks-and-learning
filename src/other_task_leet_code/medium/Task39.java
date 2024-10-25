package other_task_leet_code.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task39 {
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
//        System.out.println(onlyWithTrace(candidates, target));
//        System.out.println(finalMethod(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = onlyWithTrace(candidates,target);
        lists.addAll(finalMethod(candidates,target));
        return lists;
    }

    public static List<List<Integer>> onlyWithoutTrace(int[] candidates, int target) {
        return Arrays.stream(candidates)
                .filter(c -> target % c == 0)
                .boxed()
                .map(c -> {
                    int result = target / c;
                    return IntStream.range(0, result)
                            .mapToObj(i -> c)
                            .collect(Collectors.toList());
                })
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> onlyWithTrace(int[] candidates, int target) {
        List<Integer> list;
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> candidateList = Arrays.stream(candidates).boxed().sorted().collect(Collectors.toList());
        Collections.reverse(candidateList);
        for (int i = 0; i < candidateList.size(); i++) {
            list = new ArrayList<>();
            if (target % candidateList.get(i) == 0) {
                for (int j = 0; j < target / candidateList.get(i); j++) {
                    list.add(candidateList.get(i));
                }
                resultList.add(list);
            } else if (candidateList.contains(target % candidateList.get(i))) {
                for (int j = 0; j < (target - target % candidateList.get(i)) / candidateList.get(i); j++) {
                    list.add(candidateList.get(i));
                }
                list.add(target % candidateList.get(i));
                resultList.add(list);
            } else {
                int res = target - candidateList.get(i);
                for (int j = i + 1; j < candidateList.size(); j++) {
                    if (candidateList.get(j) == res) {
                        list.add(candidateList.get(i));
                        list.add(candidateList.get(j));
                        resultList.add(list);
                    } else if (res % candidateList.get(j) == 0) {
                        list.add(candidateList.get(i));
                        for (int k = 0; k < res / candidateList.get(j); k++) {
                            list.add(candidateList.get(j));
                        }
                        resultList.add(list);
                    }
                }

            }
        }
        return resultList;
    }

    public static List<List<Integer>> finalMethod(int[] candidates, int target) {
        List<Integer> list;
        List<List<Integer>> resultList = new ArrayList<>();
        int index = 0;
        int res = target;
        for (int i = index; i < candidates.length; i++) {
            res -= candidates[i];
            if (i == candidates.length - 1 && res != 0 && index != candidates.length - 1) {
                index += 1;
            } else if (res == 0) {
                list = new ArrayList<>();
                for (int j = i; j >= 0; j--) {
                    list.add(candidates[j]);
                }
                resultList.add(list);
                index += 1;
            } else index += 1;
        }
        return resultList;
    }
}
