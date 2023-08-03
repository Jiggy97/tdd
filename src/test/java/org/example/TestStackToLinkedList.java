package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackToLinkedList {
    @Test
    public void 일을stack에push하고pop한값은일그리고size는영() {
        StackToLinkedList<Integer> stack = new StackToLinkedList<>();
        stack.push(1);

        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void stack에일을push하고peek하면일반환() {
        StackToLinkedList<Integer> stack = new StackToLinkedList<>();
        stack.push(1);

        assertEquals(1, stack.peek());
    }

    @Test
    public void stack에일을push하고isEmpty하면false다시pop하고isEmpty하면true() {
        StackToLinkedList<Integer> stack = new StackToLinkedList<>();

        stack.push(1);
        assertEquals(false, stack.isEmpty());

        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void stack에n번push한뒤size하면n리턴() {
        StackToLinkedList<Integer> stack = new StackToLinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
    }

    @Test
    public void stack에n번push한뒤m번pop하면size는n빼기m리턴() {
        StackToLinkedList<Integer> stack = new StackToLinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();

        assertEquals(1, stack.size());
    }
}
