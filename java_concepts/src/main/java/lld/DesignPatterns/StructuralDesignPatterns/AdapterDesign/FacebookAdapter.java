package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign;

import java.util.ArrayList;
import java.util.List;

import lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.FacebookApi;
import lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.FacebookPost;

public class FacebookAdapter implements SocialMediaAdapter {
    FacebookApi fbApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> fetchFeeds(Long userId, Long timestamp) {
        List<FacebookPost> feeds = fbApi.fetchFacebookPosts(userId, timestamp);

        List<SocialMediaPost> posts = new ArrayList<SocialMediaPost>();

        for (FacebookPost f : feeds) {
            SocialMediaPost p = new SocialMediaPost();
            p.setId(f.getId());
            p.setTxt(f.getStatus());
            p.setUserId(f.getUserId());
            p.setTimestamp(f.getTimestamp());

            posts.add(p);
        }

        return posts;
    }

    @Override
    public void postFeed(Long userId, String feedText) {
        fbApi.postFacebookStatus(userId, feedText);
    }
}
