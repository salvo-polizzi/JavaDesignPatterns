package composite;

//Leaf

public class File extends FileSystem{
    private String filename;
    private int dimension;

    public File(String filename, int dimension) {
        this.filename = filename;
        this.dimension = dimension;
    }

    @Override
    public int getDimension() {return this.dimension;}

    @Override
    public String getName() {return this.filename;}

    @Override
    public void printInfo() {
        System.out.println("\tfile: " + filename + ", dim = " + dimension + " byte");
    }
}
