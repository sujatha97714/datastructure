package Stack;

public class Stack {
    int[] arr;
    int maxSize = 10;
    int size = 0;

    Stack() {
        arr = new int[this.maxSize];
    }

    Stack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
    }

    void push(int data) {
        if(this.isFull()) {
           throw new Error("Stack is full...");
        }
        this.arr[this.size] = data;
        this.size++;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean isFull() {
        return this.size == this.maxSize;
    }

    int top() {
        if(this.isEmpty()) {
            throw new Error("Stack is empty...");
        }
        return this.arr[this.size - 1];
    }

    int pop() {
        if(this.isEmpty()) {
            throw new Error("Stack is empty...");
        }
        int poppedElement = this.arr[this.size - 1];
        this.size--;
        return poppedElement;
    }

    void print() {
        for(int i = size-1; i >= 0; i--) {
            System.out.print(this.arr[i] + "\t");
        };
        System.out.println();
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
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
