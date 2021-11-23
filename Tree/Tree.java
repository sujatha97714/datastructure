package Tree;

class Node {
    int data;
    Node[] children;
    int childCount = 0;

    public Node(int data, int maxChildCount) {
        this.data = data;
        this.children = new Node[maxChildCount];
    }

    Node addChild(int data, int maxChildCount) {
        Node newNode = new Node(data, maxChildCount);
        this.children[this.childCount] = newNode;
        this.childCount++;
        return newNode;
    }
}

public class Tree {
    Node root;
    int maxChild;

    public Tree(int data, int maxChild) {
        this.maxChild = maxChild;
        this.root = new Node(data, maxChild);
    }

    public Node add(Node parent, int data) {
        return parent.addChild(data, this.maxChild);
    }

    public static void main(String[] args) {
        Tree treeObj = new Tree(1, 4);
        Node twoNode = treeObj.add( treeObj.root, 2);
        Node threeNode = treeObj.add( treeObj.root, 3);
        Node fourNode = treeObj.add(twoNode, 4);
        Node fiveNode = treeObj.add(twoNode, 5);
        treeObj.add(fiveNode, 6);
        treeObj.add(fiveNode, 7);
    }
 }
