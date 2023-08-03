package org.example;

// Stack에 필요한 함수들을 미리 interface를 통해 정의
// 모든 타입을 다룰수 있도록 generic 사용
interface Stack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}

// stack의 데이터 구조를 이어줄 StackNode class(구조체) 선언
class StackNode<E> {
    E data;
    StackNode<E> link;
}


// Stack interface 상속 (무조건 내부 선언된 함수들을 구현해야함 안하면 오류)
public class StackToLinkedList<E> implements Stack<E> {
    // Stack의 맨 위 Node의 정보를 담고있는 top을 StackNode 클래스의 변수로 StackToLinkedList의 멤버 변수이다.
    // 클래스의 멤버 변수란 해당 클래스 내부에서 선언된 변수를 의미한다.
    // 자바에서 클래스의 멤버 변수는 특정 값으로 초기화되지 않은 경우 기본 초기값으로 초기화 된다.
    // 참조 타입의 초기값 : null, 정수형 변수 : 0, 실수형 변수 : 0.0, 논리형 변수 : false
    // 참조 타입이란 int, double, char, boolean 과 같이 실제 값을 변수에 지정하는 기본 타입이 아닌
    // 객채를 가르키는 주소(메모리 위치)를 저장하고, 해당 객체에 접근할 때 이 주소를 사용하여 객체에 접근하는 것.
    // 참조 타입 예시 - 클래스(Class), 배열(Array), 인터페이스(Interface), 열거형(Enum) 등
    private StackNode<E> top;

    // 새로운 데이터를 스택에 push하기 위해 parameter값을 받고, 새롭게 노드의 인스턴스를 생성한 뒤 해당 노드의 데이터에 파라미터값을 넣어준다.
    // 또한 stack의 특성상 가장 최근에 삽입된 데이터가 top에 위치하므로 newNode의 link즉,
    // next 노드를 top으로 설정하고, top또한 newNode로 초기화 해준다.
    @Override
    public void push(E element) {
        StackNode<E> newNode = new StackNode<>();
        newNode.data = element;
        newNode.link = top;
        top = newNode;
    }

    // pop은 push의 반대 순서로 진행하면 된다.
    // 우선 return을 위해 top의 data를 저장한 뒤 top node를 next 노드인 top.link로 변경해준다.
    @Override
    public E pop() {
        E data = top.data;
        top = top.link;

        return data;
    }

    // peek은 stack의 맨 위 데이터값을 반환해주는 함수이므로 top.data의 값을 반환해준다.
    @Override
    public E peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // top에서부터 next 노드인 top.link를 따라가며 카운트를 해준다.
    // stack의 데이터를 건드리지 않기 위해서 새로운 인스턴스에 top을 대입해 count한다.
    @Override
    public int size() {
        StackNode<E> stackSize = top;
        int count = 0;
        while (stackSize != null) {
            count += 1;
            stackSize = stackSize.link;
        }

        return count;
    }
}
