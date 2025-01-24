package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.offer(99);
        pq.offer(67);
        pq.offer(69);
        System.out.println("Peek is:"+pq.peek());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }



    }
}
