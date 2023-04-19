public class Node {
    private Node left;
    private Node right;
    private Node parent;
    private int key;

    public Node(int key) {
        this.key = key;
        this.left = new NullNode();
        this.right = new NullNode();
        this.parent = new NullNode();
    }

    public Node() {}

    public boolean isNull() {return false;}

    //GETTER
    Node getLeft() {return this.left;}
    Node getRight() {return this.right;}
    Node getParent() {return this.parent;}
    int getKey() {return this.key;}

    //SETTER
    void setLeft(Node toSet) {this.left = toSet;}
    void setRight(Node toSet) {this.right = toSet;}
    void setParent(Node toSet) {this.right = toSet;}
    void setKey(int key) {this.key = key;}
}
