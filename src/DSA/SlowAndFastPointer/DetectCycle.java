package DSA.SlowAndFastPointer;

public class DetectCycle {
    public ListNodd detectCycle(ListNodd head) {

        ListNodd slow = head;
        ListNodd fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head;

                while (slow !=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;


    }

    public static void main(String[] args) {
        DetectCycle solution = new DetectCycle();

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


        ListNodd result = solution.detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at node: " + result.val);
        } else {
            System.out.println("No Cycle");
        }
    }
}
