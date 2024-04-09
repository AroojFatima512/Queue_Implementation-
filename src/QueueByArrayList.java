import java.util.ArrayList;

public class QueueByArrayList {
    ArrayList<Integer> list = new ArrayList<>();
    void enqueue(int data){
        list.add(data);
    }

    void dequeue(){
        if(list.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        list.remove(0);
    }

    void peek(){
        System.out.println(list.get(0));
    }

    void print(){
       for (int i=0; i< list.size(); i++){
           System.out.println(list.get(i));
       }
    }

    public static void main(String[] args) {
        QueueByArrayList q = new QueueByArrayList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

//        q.print();
        q.dequeue();
        q.peek();
        q.print();

    }

}
