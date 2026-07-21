package DSA.SlowAndFastPointer;

public class MiddleNode {

    public ListNodd middleNode(ListNodd head) {
        ListNodd slow = head;
        ListNodd fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNodd head = new ListNodd(1);
        head.next = new ListNodd(2);
        head.next.next = new ListNodd(3);
        head.next.next.next = new ListNodd(4);
        head.next.next.next.next = new ListNodd(5);

        MiddleNode solution = new MiddleNode();
        ListNodd result = solution.middleNode(head);

        System.out.println("Middle node value: " + result.val);
    }

}
