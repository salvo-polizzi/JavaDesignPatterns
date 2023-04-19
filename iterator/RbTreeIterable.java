import java.util.Iterator;
import java.lang.Iterable;

public class RbTreeIterable implements Iterable<Integer>{
    private RbTree tree;
    
    @Override
    public Iterator<Integer> iterator() {
        return new RbTreeIterator(tree);
    }
}
