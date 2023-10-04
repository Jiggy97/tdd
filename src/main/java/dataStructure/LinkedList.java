package dataStructure;

interface linkedListMethod<E> {
    boolean isEmpty();
    void addFirst(E element);
    void addLast(E element);
    Node<E> node(int index);
    void add(int n, E element);
    void deleteFirst();
    void delete(int n);
    E getFirstData();
    E getData(int n);
    int indexOf(E element);
    String printLinkedList();
}

public class LinkedList<E> implements linkedListMethod<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;

        newNode.link = head;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>();

        if (size==0) addFirst(element);
        else {
            tail.link = newNode;
            tail = newNode;
            size++;
        }
    }

    @Override
    public Node<E> node(int index) {
        Node<E> node = head;
        for (int i = 0; i < index; index++) node = node.link;
        return node;
    }

    @Override
    public void add(int n, E element) {
        if (n == 0) {
            addFirst(element);
        } else if (n == size - 1) {
            addLast(element);
        } else {
            Node<E> temp1 = node(n-1);
            Node<E> temp2 = temp1.link;

            Node<E> newNode = new Node<>();
            newNode.data = element;
            temp1.link = newNode;
            newNode.link = temp2;
            size++;
        }
    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void delete(int n) {

    }

    @Override
    public E getFirstData() {
        return head.data;
    }

    @Override
    public E getData(int n) {
        if (n == 0) return head.data;
        Node<E> x = head;
        for (int i = 0; i < n; i++) x = x.link;

        return x.data;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public String printLinkedList() {
        return null;
    }
}
