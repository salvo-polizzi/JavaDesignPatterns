package observer;

import java.util.List;
import java.util.Random;

public class Post{
    private String comment;
    private static List<String> emojis = List.of(":)", ":|", ":(", ":-;");
    private String currEmoji;
    private Random random = new Random(0);

    public Post(String comment) {
        this.comment = comment;
        this.currEmoji = emojis.get(random.nextInt(3));
    }

    public void printPost() {
        System.out.println("Post: " + comment + " " + currEmoji);
    }
}
