package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */
public class FifoQueue implements Queue {

    private int value;

    private FifoQueue next;

    public FifoQueue() {
    }

    public FifoQueue(int value) {
        this.value = value;
    }

    @Override
    public void push(int value) {
        FifoQueue last = getLast();
        last.next = new FifoQueue(value);


    }

    private FifoQueue getLast() {
        FifoQueue fifoQueue = this;
        while (fifoQueue.next != null) {
            fifoQueue = fifoQueue.next;
        }
        return fifoQueue;
    }

    @Override
    public int pop() {
        if (this.next == null) {
            System.out.println("Queue is empty");
            return 0;
        }
        FifoQueue first =  this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    @Override
    public Queue clone() {
     FifoQueue clonedQueue = new FifoQueue();
        FifoQueue returnQueue = clonedQueue;
        FifoQueue tmpQueue = this.next;
        while (tmpQueue != null) {
            clonedQueue.next = new FifoQueue(tmpQueue.value);
            tmpQueue = tmpQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return  returnQueue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        FifoQueue fifoQueue = this.next;
        stringBuilder.append("[");
        while (fifoQueue != null) {
            stringBuilder.append(fifoQueue.value);
            if (fifoQueue.next != null) {
                stringBuilder.append(",");
            }
            fifoQueue = fifoQueue.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
