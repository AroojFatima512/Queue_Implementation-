import java.util.Stack;

public class QueueByStacks {
    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2 = new Stack<>();
    void add(int data){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        System.out.println(stack1.peek());

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    int dequeue(){
       if (stack1.isEmpty()){
            System.out.println("List is Empty");
        }
       return stack1.pop();
    }
    public static void main(String[] args) {
        QueueByStacks q= new QueueByStacks();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
