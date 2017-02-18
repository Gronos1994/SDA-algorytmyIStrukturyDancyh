package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */
public interface Queue {
    void push (int value);
    int pop ();

    Queue clone ();
}
