package observer;

public class Client {
    private static CreatorAccount creator = new CreatorAccount();
    private static PostContainer container = new PostContainer();
    private static Post posts[] = {new Post("Oggi mi sento molto bene!"), new Post("Veramente una bella giornata!"), new Post("Cazzi tuoi!")};

    public static void main(String[] args) {
        SocialAccount acc1 = creator.createFacebookAccount(container);
        SocialAccount acc2 = creator.createInstagramAccount(container);
        
        for (Post i : posts) {
            //wait for subscribing
            container.addPost(i);
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        container.close();
    }
    
}
