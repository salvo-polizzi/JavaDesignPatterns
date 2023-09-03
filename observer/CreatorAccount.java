package observer;

import java.util.List;
import java.util.Random;

//Concrete creator

public class CreatorAccount {
    private List<String> names = List.of("Giovanni Storti", "Salvo Polizzi", "Giovanni Mucciaccia", "Geronimo Stilton");
    private static int index = 0;
    private Random rand = new Random(0);

    private void updateIndex() {
        if (index+1 < names.size())
            index++;
        else
            index = 0;
    }

    public SocialAccount createFacebookAccount(PostContainer channel) {
        System.out.println("Istanzio account facebook");
        SocialAccount acc = new FacebookAccount(names.get(rand.nextInt(names.size())), channel);
        updateIndex();
        return acc;
    }

    public SocialAccount createInstagramAccount(PostContainer channel) {
        System.out.println("Istanzio account instagram");
        SocialAccount acc = new InstagramAccount(names.get(rand.nextInt(names.size())), channel);
        updateIndex();
        return acc;
    }
}
