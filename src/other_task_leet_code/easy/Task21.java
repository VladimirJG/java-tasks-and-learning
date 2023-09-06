package other_task_leet_code.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Вам даны заголовки двух отсортированных связанных списков list1и list2.

Объедините два списка в один отсортированный список.
Список должен быть составлен путем сращивания узлов первых двух списков.

Возвращает заголовок объединенного связанного списка .

Ввод: список1 = [1,2,4], список2 = [1,3,4]
 Выход: [1,1,2,3,4,4]
 */
public class Task21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = mergeTwoLists(list1, list2);
        System.out.println(list3);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        List<Integer> newList = new ArrayList<>();
        addToList(list1, newList);
        addToList(list2, newList);
        Collections.reverse(newList);
        ListNode head = null;
        for (Integer num : newList) {
            head = new ListNode(num, head);
            list3 = head;
        }
        return list3;
    }


    private static void addToList(ListNode l1, List<Integer> newList) {
        ListNode nextV1 = l1;
        while (nextV1 != null) {
            newList.add(nextV1.val);
            nextV1 = nextV1.next;
        }
        Collections.sort(newList);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
