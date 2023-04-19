import java.util.Iterator;

public class MainTree {
    public static void main(String[] args) {
        RbTree myTree = new RbTree();

        myTree.insert(10);
        myTree.insert(2343);
        myTree.insert(45323);
        myTree.insert(6466);
        myTree.insert(8979);
        
        Iterator<Integer> myIt = new RbTreeIterator(myTree);

        //Iterating with object iterator
        while(myIt.hasNext()) {
            System.out.print(myIt.next()+" ");
        }
        System.out.println("\n");
    }
}
