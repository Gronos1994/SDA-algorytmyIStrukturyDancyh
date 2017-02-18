package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(3);
        myLinkedList.add(-2);
        myLinkedList.add(-1);
        myLinkedList.add(-5);
        System.out.println(myLinkedList);
        myLinkedList.delete(3);
        System.out.println("After removing 3rd element: \n" + myLinkedList);
        System.out.println();
        MyListInterface someList = new MyList();
        someList.add(2);
        someList.add(4);
        someList.add(-1);
        System.out.println("Before and after adding some list");
        System.out.println(myLinkedList);
        myLinkedList.addAll(someList);
        System.out.println(myLinkedList);
        System.out.println();
        MyListInterface clonedList = myLinkedList.clone();
        clonedList.delete(2);
        System.out.println("After removing value from cloned list");
        System.out.println(myLinkedList);
        System.out.println(clonedList);
        System.out.println();

        System.out.println("Before and adding element on index 2");
        System.out.println(myLinkedList);
        myLinkedList.add(0, -1);
        System.out.println(myLinkedList);

        System.out.println("Before and after adding all into");
        System.out.println(myLinkedList);
        myLinkedList.addAll(2, someList);
        System.out.println(myLinkedList);
    }
}
