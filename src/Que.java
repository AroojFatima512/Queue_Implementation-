
import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>() ;
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }
}
