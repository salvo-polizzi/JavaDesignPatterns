package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

//Observer

public abstract class SocialAccount implements Subscriber<Post>{
    protected String accountName;
    protected List<Post> publishedPost = new ArrayList<>();
    protected Subscription s;
    
    public SocialAccount(String accountName, PostContainer channel) {
        this.accountName = accountName;
        channel.subscribe(this);
    }

    public abstract void printNewPost(Post aPost);
}