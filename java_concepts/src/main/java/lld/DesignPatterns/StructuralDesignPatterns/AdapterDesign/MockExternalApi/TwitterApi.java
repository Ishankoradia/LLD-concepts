package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi;

import java.util.List;
import static lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.ApiUtils.logTwitterGetPosts;
import static lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.ApiUtils.logTwitterPostStatus;;

public class TwitterApi {
    public List<TwitterTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        logTwitterGetPosts();
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        logTwitterPostStatus();
    }
}
