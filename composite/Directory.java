package composite;

import java.util.ArrayList;
import java.util.List;

//Composite

public class Directory extends FileSystem{
    private String dirName;
    private List<FileSystem> filesInDirectory = new ArrayList<>();

    public Directory(String dirName) {
        this.dirName = dirName;
    }

    @Override 
    public void add(FileSystem f) {filesInDirectory.add(f);} 

    @Override
    public void remove(FileSystem f) {
        if (!filesInDirectory.remove(f))
            System.out.println("File or directory To remove not found");
    }   

    @Override
    public int getDimension() {
        int dim = 0;
        for (FileSystem f : filesInDirectory) {
            dim += f.getDimension();
        }
        return dim;
    }

    @Override
    public String getName() {
        return dirName;
    }

    @Override
    public void printInfo() {
        System.out.println("Cartella: " + dirName);
        for (FileSystem f : filesInDirectory) {
            f.printInfo();
        }

        System.out.println("Dimensione totale: " + getDimension());
    }
}
