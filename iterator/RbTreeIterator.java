import java.util.Iterator;

public class RbTreeIterator implements Iterator<Integer>{
    private RbTree myTree;
    private int index = 0;


    public RbTreeIterator(RbTree tree) {
        this.myTree = tree;
        myTree.inorder(myTree.root);
    }

    @Override
    public Integer next() {
        return myTree.elements.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < myTree.elements.size();
    }
}
