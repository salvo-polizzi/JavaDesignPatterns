package abstract_factory;

public class EnglishMenuCreator implements MenuCreator{
    public Appetizer getAppetizer() {
        return new EnglishAppetizer();
    }
    
    public FirstDishes getFirstDishes() {
        return new EnglishFirstDishes();
    }

    //public SecondDishes getSecondDishes() {}
}
