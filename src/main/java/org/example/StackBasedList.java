package org.example;

import java.util.ArrayList;
import java.util.List;
// 내부 클래스를 만들고
// linked list



public class StackBasedList<E> implements StackFunction<E> {
    private final List<E> stackList;

    public StackBasedList() {
        stackList = new ArrayList<>();
    }

    @Override
    public void push(E element) {
        stackList.add(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.remove(stackList.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    @Override
    public int size() {
        return stackList.size();
    }
}
