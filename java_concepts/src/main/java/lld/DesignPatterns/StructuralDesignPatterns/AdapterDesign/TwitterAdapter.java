package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign;

import java.util.ArrayList;
import java.util.List;

import lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.TwitterApi;
import lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.TwitterTweet;

public class TwitterAdapter implements SocialMediaAdapter {
    TwitterApi tApi = new TwitterApi();

    @Override
    public List<SocialMediaPost> fetchFeeds(Long userId, Long timestamp) {
        List<TwitterTweet> feeds = tApi.getTweets(userId);

        List<SocialMediaPost> posts = new ArrayList<SocialMediaPost>();

        for (TwitterTweet f : feeds) {
            SocialMediaPost p = new SocialMediaPost();
            p.setId(f.getId());
            p.setTxt(f.getTweet());
            p.setUserId(f.getUserId());

            posts.add(p);
        }

        return posts;
    }

    @Override
    public void postFeed(Long userId, String feedText) {
        tApi.tweet(userId, feedText);
    }
}
