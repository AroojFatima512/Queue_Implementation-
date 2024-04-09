public class QueueByArray {
    int [] arr;
    int size;
    int rear;
    QueueByArray(){
        this.arr = new int[10];
        this.rear = -1;
    }

    boolean isEmpty(){
        return rear == -1;
    }
      void enqueue(int data){
        if (rear == arr.length-1){
            System.out.println("Queue is Full");
            return;
        }
          rear++;
          arr[rear] = data;
          size++;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    void print(){
        for (int i=0; i<=rear; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        QueueByArray q = new QueueByArray();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.dequeue();
        q.print();

    }
}
