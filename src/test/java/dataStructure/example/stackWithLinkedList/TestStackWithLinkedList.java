package dataStructure.example.stackWithLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackWithLinkedList {
    StackWithLinkedList<Integer> stack = new StackWithLinkedList<>();

    @Test
    public void 스택에이즈엠티하면트루() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void 스택에푸쉬를하고스택이즈엠티하면폴스() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void 스택에일푸쉬를하고팝을하면일() {
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void 스택에일을푸쉬하고픽하면일() {
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void 스택에일과이를차례로푸쉬하고팝을한뒤픽을하면일() {
        stack.push(1);
        stack.push(2);
        stack.pop();

        assertEquals(1, stack.peek());
    }

    @Test
    public void 스택에푸쉬를하고사이즈를하면일() {
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    public void 스택에푸쉬하고사이즈를하기전후픽의값이같은지확인() {
        stack.push(1);
        int beforeSize = stack.peek();
        stack.size();
        assertEquals(stack.peek(), beforeSize);
    }
}
