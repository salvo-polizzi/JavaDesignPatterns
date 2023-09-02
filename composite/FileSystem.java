package composite;

//Component

public abstract class FileSystem {
    public abstract int getDimension();
    public abstract String getName();
    public abstract void printInfo();

    public void add(FileSystem f) {}
    public void remove(FileSystem f) {}
}
