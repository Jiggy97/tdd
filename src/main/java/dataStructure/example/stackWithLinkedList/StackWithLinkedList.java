package dataStructure.example.stackWithLinkedList;

interface stackMethod<E> {
    boolean isEmpty();
    void push(E element);
    E pop();
    E peek();
    int size();
}

class Node<E> {
    E data;
    Node<E> link;
}

public class StackWithLinkedList<E> implements stackMethod<E> {
    Node<E> top = new Node<>();

    @Override
    public boolean isEmpty() {
        return top == null;
        // return top.link == null; 해도 오류가 발생하지 않는다 왜지?
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;
        newNode.link = top;
        top = newNode;
    }

    @Override
    public E pop() {
        E data = top.data;
        top = top.link;

        return data;
    }

    @Override
    public E peek() {
        return top.data;
    }

    @Override
    public int size() {
        int count = 0;
        while(top.link!=null) {
            top = top.link;
            count += 1;
        }
        return count ;
    }
}
