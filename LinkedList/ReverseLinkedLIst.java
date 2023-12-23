public class ReverseLinkedLIst {

    public static LinkedList.Node ReverseLinkedList(LinkedList.Node head){
        LinkedList.Node prev=null;
        LinkedList.Node curr=head;

        while(curr!=null){
        LinkedList.Node temp = curr.next;
          curr.next=prev;
          prev=curr;
          curr=temp;
        }
        return prev;
            
    }
    public static void main(String[] args) {

        LinkedList.addLast(23);
        LinkedList.addLast(12);
        LinkedList.addLast(50);
        LinkedList.addLast( 10);
        LinkedList.addLast( 123);

      LinkedList.Node newHead=ReverseLinkedList(LinkedList.getFirst());
       LinkedList.printLL(newHead);

    }
    
}
