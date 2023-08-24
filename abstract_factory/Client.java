package abstract_factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("Italian menu\n");
        MenuCreator menu = new ItalianMenuCreator();

        Appetizer app = menu.getAppetizer();
        FirstDishes fd = menu.getFirstDishes();

        app.printNamePlates();
        fd.printNamePlates();
    }    
}
