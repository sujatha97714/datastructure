package List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    Node head;
    Node tail;

    Node getLastNode() {
        Node current = this.head;
        // condition for checking whether the node r is the last one
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    void add(int data) {
        // step 1 - creating the node with data
        Node newNode = new Node(data);
        if(this.head == null) {
            // make new node as head
            this.head = newNode;
            this.tail = newNode;
        } else {
            // attach new node to last node
            // Node lastNode = this.getLastNode();
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    void printElement() {
        Node current = this.head;
        // condition for checking whether the node r is the last one
        while(current != null) {
            System.out.println(current.data);
            current = current.next == this.head ? null : current.next;
        };
    }

    int getLength() {
        Node current = this.head;
        int length = 0;
        // condition for checking whether the node r is the last one
        while(current != null) {
            length++;
            current = current.next == this.head ? null : current.next;
        };
        return length;
    }

    int getPosition(int data) {
        Node current = this.head;
        int pos = 0;
        while(current != null) {
            pos++;
            if(current.data == data) {
                return pos;
            }
            current = current.next == this.head ? null : current.next;
        }
        return -1;
    }

    boolean isCircular() {
        Node rab = this.head;
        Node tor = this.head;
        while(rab != null && rab.next != null) {
            rab = rab.next.next;
            tor = tor.next;
            if(tor == rab) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // 3, 5, 7, 10
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(10);
        ll.tail.next = ll.head;
        ll.printElement();
        System.out.println("Is Circular? " + ll.isCircular());
        int num = 5;
        System.out.println("The number " + num + " is at position " + ll.getPosition(num));
    }
}


// head
// [user1, next] -> [user2, next]-> -> [user3, next]-> [user4, next] -> [user5, next]-> [user6, next]-> null

// => head = null;

// input : 3
// head, tail
// node{data: 3, next: null}


// input : 5
// head                    tail
// node{data: 3, next: => node{data: 5, next: null}


// input : 10
// head                                          tail
// node{data: 3, next: => node{data: 5, next: => node{data: 10, next:null}