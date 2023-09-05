package other_task_leet_code.medium;
/*
Вам даны два непустых связанных списка, представляющих
два неотрицательных целых числа. Цифры хранятся в обратном порядке ,
и каждый из их узлов содержит одну цифру. Сложите два числа и верните сумму
в виде связанного списка.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ListNode lN1 = new ListNode(2, new ListNode(8, new ListNode(9)));
        ListNode lN2 = new ListNode(5, new ListNode(1, new ListNode(9)));
        ListNode newList = addTwoNumbers(lN1, lN2);
        System.out.println(newList);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode v1 = l1;
        ListNode v2 = l2;
        List<Integer> list = new ArrayList<>();
        int variable = 0;
        int res;
        while (v1.next != null & v2.next != null) {
            res = v1.val + v2.val;
            if (res > 9) {
                list.add((variable == 0 ? res - 10 : res + 1 - 10));
                variable = 1;
            } else if (res == 9) {
                if (variable == 0) list.add(res);
                else {
                    list.add(0);
                    variable = 1;
                }
            } else {
                list.add((variable == 0 ? res : res + 1));
                variable = 0;
            }
            v1 = v1.next;
            v2 = v2.next;
        }

        res = v1.val + v2.val;
        if (variable == 0 & res <= 9) list.add(res);
        else if (variable == 0 & res > 9) {
            list.add(res - 10);
            variable = 1;
        } else if (variable == 1 & res < 9) {
            list.add(res + 1);
            variable = 0;
        } else if (variable == 1 & res >= 9) {
            list.add(res + 1 - 10);
            variable = 1;
        }

        while (v1.next == null & v2.next != null || v1.next != null) {
            if (v1.next == null & v2.next != null) {
                res = v2.next.val;
                if (variable == 0) {
                    list.add(res);
                } else {
                    if (res >= 9) {
                        list.add(res + 1 - 10);
                    } else {
                        list.add(res + 1);
                        variable = 0;
                    }
                }
                v2 = v2.next;
            } else {
                res = v1.next.val;
                if (variable == 0) {
                    list.add(res);
                } else {
                    if (res >= 9) {
                        list.add(res + 1 - 10);
                    } else {
                        list.add(res + 1);
                        variable = 0;
                    }
                }
                v1 = v1.next;
            }
        }
        if (variable == 1) {
            list.add(variable);
        }
        ListNode node = new ListNode();
        Collections.reverse(list);
        ListNode head = null;
        for (Integer integer : list) {
            head = new ListNode(integer, head);
            node = head;
        }
        return node;
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
