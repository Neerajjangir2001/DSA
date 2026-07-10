package DSA.Two_pointer;



//Problem Statement
//
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
//
//Return the linked list sorted as well.
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {


        ListNode current = head;

        for (current = head; current != null && current.next != null;){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }

        }

        return head;
    }

    public static void main(String[] args) {

        // Create linked list:
        // 1 -> 1 -> 2 -> 3 -> 3

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        Solution solution = new Solution();

        ListNode result = solution.deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}