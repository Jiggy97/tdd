package org.example;

public interface StackFunction<E> {
    void push(E element);

    E pop();

    E peek();

    boolean isEmpty();

    int size();
}
