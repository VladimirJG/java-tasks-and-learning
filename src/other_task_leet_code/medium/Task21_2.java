package other_task_leet_code.medium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task21_2 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(9))));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> integers = new ArrayList<>();
        while (list1 != null) {
            integers.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            integers.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(integers);
        Collections.reverse(integers);
        ListNode list3 = new ListNode();
        ListNode nextNode = null;
        for (Integer val : integers) {
            nextNode = new ListNode(val, nextNode);
            list3 = nextNode;
        }
        return list3;
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
