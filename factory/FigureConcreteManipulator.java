package factory;

public class FigureConcreteManipulator extends FigureManipulator{
    public Figure createFigure(int numSides, Boolean equals) {
        if (numSides == 3)
            return new Triangle();
        else if (numSides == 4 && equals)
            return new Square();
        else
            return new Rectangle();
    }
}
