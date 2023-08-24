package abstract_factory;

public class ItalianMenuCreator implements MenuCreator{
    public Appetizer getAppetizer() {
        return new ItalianAppetizer();
    }
    
    public FirstDishes getFirstDishes() {
        return new ItalianFirstDishes();
    }
}
