package observer;

import java.util.concurrent.Flow.Subscription;

//Concrete Observer

public class InstagramAccount extends SocialAccount{
    public InstagramAccount(String accountName, PostContainer channel) {
        super(accountName, channel);
    }

    public void printNewPost(Post aPost) {
        System.out.println("----------Instagram Account di " + accountName + "---------");
        aPost.printPost();
        System.out.println("------------------------------------------\n");
    }

    @Override
    public void onSubscribe(Subscription s) {
        this.s = s;
        System.out.println("Instagram account subscripted");
        this.s.request(1);
    }

    @Override
    public void onNext(Post apost) {
        this.publishedPost.add(apost);
        printNewPost(apost);
        this.s.request(1);
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {
        System.out.println("Terminated subscription");
    }
}
