import java.util.List;
import java.util.ArrayList;

public class RbTree{
    Node root;
    List<Integer> elements = new ArrayList<Integer>();


    public RbTree() {
        root = new NullNode();
        System.out.println("Tree created");
    }

    public Node getRoot() {return this.root;}

    public void insert(int key) {
        Node toInsert = new Node(key);

        Node toTrail = root;
        Node y = new NullNode();

        while(!toTrail.isNull()) {
            y = toTrail;
            if(key <= toTrail.getKey()) {
                toTrail = toTrail.getLeft();
            }else {
                toTrail = toTrail.getRight();
            }
        }

        if(y.isNull()) {
            root = new Node(key);
            return;
        }

        if(key <= y.getKey()) {
            y.setLeft(toInsert);
        } else {
            y.setRight(toInsert);
        }
    }

    void inorder(Node visited) {
        if(visited.isNull()) return;
        inorder(visited.getLeft());
        elements.add(visited.getKey());
        inorder(visited.getRight());
    }

}

