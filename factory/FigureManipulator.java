package factory;

//FigureManipulator is the Creator

public abstract class FigureManipulator {
    public abstract Figure createFigure(int numSides, Boolean equals);
}
