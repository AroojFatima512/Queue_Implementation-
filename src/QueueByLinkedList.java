public class QueueByLinkedList {
    Node head;
    Node tail;
    void add(int data){
        Node node = new Node(data);
        if(head == null || tail == null){
            head = tail =  node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    void remove(){
        if(head == tail){
            head = tail = null;
            return;
        }
        System.out.println(head.data);
        head = head.next;
    }

    void peek(){
        if(head == null || tail == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data);
    }

    void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        QueueByLinkedList linkedList = new QueueByLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.peek();
        System.out.println();
        linkedList.print();
        System.out.println();

    }
}
