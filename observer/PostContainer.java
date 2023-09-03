package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

//Concrete Subject

public class PostContainer {
    private SubmissionPublisher<Post> subPost = new SubmissionPublisher<>();
    private List<Post> listPost = new ArrayList<>();

    public void subscribe(Subscriber<Post> account) {
        subPost.subscribe(account);
    }

    public void addPost(Post aPost) {
        listPost.add(aPost);
        subPost.submit(aPost);
    }

    public void close() {
        subPost.close();
    }
}
