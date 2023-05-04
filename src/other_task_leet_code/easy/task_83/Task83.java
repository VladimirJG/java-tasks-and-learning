package other_task_leet_code.easy.task_83;

//83. Remove Duplicates from Sorted List
public class Task83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode res = deleteDuplicates(head);

        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode newHead = head;

        while (newHead.next!=null){
            if(newHead.val == newHead.next.val){
                newHead.next = newHead.next.next;
            }else {
                newHead = newHead.next;
            }
        }
        return head;
    }

}

