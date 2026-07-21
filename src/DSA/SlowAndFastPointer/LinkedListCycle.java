package DSA.SlowAndFastPointer;



public class LinkedListCycle {


    public boolean hasCycle(ListNodd head) {

       ListNodd slow = head;
       ListNodd fast = head;

       while (fast != null && fast.next != null) {

           slow = slow.next;
           fast = fast.next.next;

           if (slow == fast) {
               return true;
           }

       }

        return false;
    }

    public static void main(String[] args) {

        // Create nodes
        ListNodd head = new ListNodd(3);
        ListNodd second = new ListNodd(2);
        ListNodd third = new ListNodd(0);
        ListNodd fourth = new ListNodd(-4);

        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create a cycle
        fourth.next = second;

        LinkedListCycle solution = new LinkedListCycle();

        System.out.println(solution.hasCycle(head));
    }
}
