public class LinkedList {
     // Simple LinkedList operations functions to understand the working of
     // LinkedList

     // Node class
     public static class Node {
          int data;
          Node next;

          Node(int data, Node next) {
               this.data = data;
               this.next = next;
          }
     }

     public static Node head;
     public static Node tail;
     public static int size;

     public static Node getFirst(){
          if(head==null){
               System.out.println("Empty LinkedList");
               return null;
          }
          return head;
     }
     public static Node getLast(){
          if(tail==null){
                 System.out.println("Empty LinkedList");
               return null;
          }
          return null;
     }

     public static void addFirst(int data) {

          Node newNode = new Node(data, null);
          if (head == null) {
               head = tail = newNode;
          } else {
               newNode.next = head;
               head=newNode;
          }
          size++;

     }

     public static void addLast(int data){
          Node newNode = new Node(data,null);
          if(tail==null || head==null){
               head=tail=newNode;
          }
            tail.next=newNode;
            tail=newNode;
          size++;
     }

     public static void add(int data, int index){
             Node newNode=new Node(data,null);
             if(index==0){
               addFirst(data);
               return ;
             }
             if(index==size+1){
               addLast(data);
               return ;
             }
        if(index<0){
          return ;
        }
        size++;
        Node temp=head;
        int i=0 ;
        while(i<index-1){
          temp=temp.next;
          i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

     }

     public static int removeFirst(){
          
          if(head==null){
               System.out.println("Linked list is Empty");
               return -1;
           }
           if(size==1){
               int data=head.data;
               head=tail=null;
               size=0;
               return data ;
           }
           size--;
           int data=head.data;
           head=head.next;
           return data;

     }

     public static int removeLast(){
          if(tail==null){
               System.out.println("Linked list is Empty");
               return -1;
          }
          int val=tail.data;
          if (size == 1) {
                val = head.data;
               head = tail = null;
               size = 0;
               return val;
           }
           size--;
           int i=0 ;
           Node temp=head;
           while(i<size-1){
           temp=temp.next;
           i++;
           }
             tail=temp;
            temp.next=null;

           return val;
     }

     public static int remove(int index){
          if(index<0){
               System.out.println("Invalid index");
               return -1;
          }
          if(index>=size){
               System.out.println("Given index exceeded the size of linkedList");
               return -1;
          }
          size--;
          Node temp=head;
          int i=0 ;
          while(i<index-1){
               temp=temp.next;
               i++;
          }
          int val = temp.next.data;
          temp.next=temp.next.next;
          return val ;
     }

     public static void printLL(Node head){
          Node temp=head;
           while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
           }
           System.out.println();
     }

      
 
     public static void main(String[] args) {

          // Node tail=new Node(20,null);
          // Node head=new Node(12,tail);
          // System.out.println(head.next.data);

          //Methods declared static no need to create object directly we can use using function name

         addFirst(12);
         addLast(20);
         add(16,2);
         addFirst(10);
         addLast(22);
         System.out.println(removeFirst());
        printLL(head);


     }

}
