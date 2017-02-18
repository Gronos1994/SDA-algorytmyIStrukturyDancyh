package test.algorytmy.structures;

import algorytmy.structures.queue.FifoQueue;
import algorytmy.structures.queue.Queue;

/**
 * Created by RENT on 2017-02-18.
 */
public class FifoQueueTests {
public static void main (String[] args) {
    Queue queue = new FifoQueue();
    queue.push(2);
    queue.push(4);
    queue.push(234);
    System.out.println(queue);
    queue.push(8);
    System.out.println(queue);
    System.out.println(queue.clone());
}
}
