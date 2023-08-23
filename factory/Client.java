package factory;

public class Client {
    public static void main(String[] args) {
        FigureManipulator manipulator = new FigureConcreteManipulator();

        Figure triangle = manipulator.createFigure(3, false);
        Figure square = manipulator.createFigure(4, true);

        triangle.printStatistics();
        square.printStatistics();
    }
}
