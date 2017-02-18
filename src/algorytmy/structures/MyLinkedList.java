package algorytmy.structures;

public class MyLinkedList implements algorytmy.structures.MyListInterface {

    private int value;

    private MyLinkedList next;

    private MyLinkedList(int value) {
        this.value = value;
    }

    public MyLinkedList() {

    }

    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();
        MyLinkedList tmpObject = new MyLinkedList();
        tmpObject.value = value;
        myLinkedList.next = tmpObject;
    }

    private MyLinkedList getLast() {
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int index, int value) {

        if (checkIndex(index)) {
            MyLinkedList element = getElement(index - 1);
            MyLinkedList nextElement = getElement(index);
            MyLinkedList addingElement = new MyLinkedList(value);
            addingElement.next = nextElement;
            element.next = addingElement;

        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < getSize();
    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = getElement(index);
        if (myLinkedList == null) {
            System.out.println("Wrong index");
            return 0;
        }
        return myLinkedList.value;
    }

    private MyLinkedList getElement(int index) {
        MyLinkedList myLinkedList = this;
        if (index < -1) {
            return null;
        }
        for (int i = 0; i <= index; i++) {
            if (myLinkedList.next == null) {
                return null;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void put(int index, int value) {
        MyLinkedList element = getElement(index);
        if (element != null) {
            element.value = value;
        }

    }

    @Override
    public void addAll(algorytmy.structures.MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            this.add(myList.get(i));
        }

    }

    @Override
    public void addAll(int index, MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            this.add(index + i, myList.get(i));
        }



    }

    @Override
    public void delete(int index) {
        if (index < getSize()) {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList deletingElement = getElement(index);
            previousElement.next = deletingElement.next;
            deletingElement.next = null;
        }

    }

    @Override
    public MyListInterface clone() {
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < this.getSize(); i++) {
            myLinkedList.add(this.get(i));

        }
        return myLinkedList;
    }

    @Override
    public int getSize() {
        int counter = 0;
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            counter++;
            myLinkedList = myLinkedList.next;
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.getSize(); i++) {
            stringBuilder.append(this.get(i));
            if (i != getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
