package org.example;

interface StackMethod<E> {
    boolean isEmpty();

    void push(E element);

    E pop();

    E peek();

//    int size();
}

class Node<E> {
    E data;
    Node<E> link;
}

public class StackAgain<E> implements StackMethod<E> {
    Node<E> top = new Node<>();

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(E element) {
        Node<E> node = new Node<>();

        node.data = element;
        node.link = top;
        top = node;
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
}
