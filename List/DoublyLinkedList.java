package List;

class TwoWayNode {
    int data;
    TwoWayNode next;
    TwoWayNode prev;

    TwoWayNode(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {

    TwoWayNode head;
    TwoWayNode tail;

    TwoWayNode getLastNode() {
        TwoWayNode current = this.head;
        // condition for checking whether the node r is the last one
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    void add(int data) {
        // step 1 - creating the node with data
        TwoWayNode newNode = new TwoWayNode(data);
        if(this.head == null) {
            // make new node as head
            this.head = newNode;
            this.tail = newNode;
        } else {
            // attach new node to last node
            // Node lastNode = this.getLastNode();
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    void printElement() {
        TwoWayNode current = this.head;
        // condition for checking whether the node r is the last one
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        };
    }

    void PrintReverse() {
        TwoWayNode current = this.tail;
        // condition for checking whether the node r is the last one
        while(current != null) {
            System.out.println(current.data);
            current = current.prev;
        };
    }

    int getLength() {
        TwoWayNode current = this.head;
        int length = 0;
        // condition for checking whether the node r is the last one
        while(current != null) {
            length++;
            current = current.next == this.head ? null : current.next;
        };
        return length;
    }

    boolean isCircular() {
        TwoWayNode rab = this.head;
        TwoWayNode tor = this.head;
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
        DoublyLinkedList ll = new DoublyLinkedList();
        // 3, 5, 7, 10
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(10);
        ll.printElement();
        ll.PrintReverse();
    }
}


// head
// [null <- prev, user1, next] <-> [ prev, user2, next] <-> [prev, user3, next] <-> [prev, user4, next] <-> [prev, user5, next] <-> [prev, user6, next]-> null
