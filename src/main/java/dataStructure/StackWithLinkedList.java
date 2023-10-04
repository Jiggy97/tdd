package dataStructure;

interface stackMethod<E> {
    boolean isEmpty();
    void push(E element);
    E pop();
    E peek();
    int size();
}

public class StackWithLinkedList<E> implements stackMethod<E> {
    Node<E> top;

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
        Node<E> node = top;
        int count = 0;
        while(node!=null) {
            node = node.link;
            // 기존 코드에서는 새로운 객체를 통해 top을 참조하지 않고
            // top을 바로 사용하였다, return 값은 정확하지만 의도것과 다르게 stack을 건드리게 된다.
            count += 1;
        }
        return count;
    }
}
