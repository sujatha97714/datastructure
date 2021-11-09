package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
};

public class StackList {
    
    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    boolean isEmpty() {
        return head == null;
    }

    void pop() {
        if(this.isEmpty()) {
            throw new Error("Stack is empty...");
        }
        this.head = this.head.next;
    }

    int top() {
        if(this.isEmpty()) {
            throw new Error("Stack is empty...");
        }
        return this.head.data;
    }

    void print() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackList st = new StackList();
        System.out.println("Initiated stack");
        st.print();
        System.out.println("Pushing 3");
        st.push(3);
        st.print();
        System.out.println("Pushing 4");
        st.push(4);
        st.print();
        System.out.println("Pushing 5");
        st.push(5);
        st.print();
        System.out.println("Pushing 6");
        st.push(6);
        st.print();
        System.out.println("Popping...");
        st.pop();
        st.print();
        System.out.println("Pushing 7");
        st.push(7);
        st.print();
        System.out.println("Pushing 8");
        st.push(8);
        st.print();
        System.out.println("Pushing 9");
        st.push(9);
        st.print();
    }
}


