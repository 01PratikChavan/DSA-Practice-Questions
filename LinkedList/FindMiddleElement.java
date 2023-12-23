
public class FindMiddleElement {

    // Here the methods from LinkedList file are used to avoid multiple times writting the same code 
   
    public static int  middleNode(LinkedList.Node head) {
        LinkedList.Node  slow = head;
        LinkedList.Node  fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        
        LinkedList.addLast(23);
        LinkedList.addLast(12);
        LinkedList.addLast(50);
        LinkedList.addLast( 10);
        LinkedList.addLast( 123);
    
         int   middle = middleNode(LinkedList.getFirst());
        System.out.println("middle element "+ middle);
}
}