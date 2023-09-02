package composite;

public class Client {
    private static File fileList[] = {new File("pippo.txt", 255), new File("codice.c", 2345), new File("masterplan.csv", 5443)};
    private static Directory home = new Directory("home");
    private static Directory etc = new Directory("etc");
    private static Directory tmp = new Directory("tmp");

    public static void main(String[] args) {
        FileSystem myFileSystem = new Directory("root");

        System.out.println("---Aggiungo file alle directory---");
        for (File f : fileList) {
            home.add(f);
            etc.add(f);
            tmp.add(f);
            myFileSystem.add(f);
        }

        System.out.println("---Aggiungo directory---");
        myFileSystem.add(home);
        myFileSystem.add(etc);
        myFileSystem.add(tmp);

        myFileSystem.printInfo();
    }
}
