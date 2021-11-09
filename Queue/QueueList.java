package Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
};

public class QueueList {
    Node head;
    Node tail;

    void enqueue(int data) {
        // step 1 - creating the node with data
        Node newNode = new Node(data);
        if(this.head == null) {
            // make new node as head
            this.head = newNode;
            this.tail = newNode;
        } else {
            // attach new node to last node
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    void dequeue() {
        if(this.isEmpty()) {
            throw new Error("Queue is empty...");
        }
        this.head = this.head.next;
    }

    int peek() {
        if(this.isEmpty()) {
            throw new Error("Queue is empty...");
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
        QueueList q = new QueueList();
        System.out.println("Initiated queue");
        q.print();
        System.out.println("enqueueing 3");
        q.enqueue(3);
        q.print();
        System.out.println("enqueueing 4");
        q.enqueue(4);
        q.print();
        System.out.println("enqueueing 5");
        q.enqueue(5);
        q.print();
        System.out.println("enqueueing 6");
        q.enqueue(6);
        q.print();
        System.out.println("Popping...");
        q.dequeue();
        q.print();
        System.out.println("enqueueing 7");
        q.enqueue(7);
        q.print();
        System.out.println("enqueueing 8");
        q.enqueue(8);
        q.print();
        System.out.println("enqueueing 9");
        q.enqueue(9);
        q.print();
    }
}

// Enquque - insert at one end
// Dequeue - remove from other end
