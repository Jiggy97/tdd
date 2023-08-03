package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackBasedList {
    @Test
    public void 일을push하고pop하면일이반환된다() {
        StackFunction<Integer> stack = new StackBasedList<>();
        stack.push(1);
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }
}
