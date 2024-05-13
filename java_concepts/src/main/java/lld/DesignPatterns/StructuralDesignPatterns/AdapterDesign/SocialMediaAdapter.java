package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign;

import java.util.List;

public interface SocialMediaAdapter {
    public List<SocialMediaPost> fetchFeeds(Long userId, Long timestamp);

    public void postFeed(Long userId, String feedText);
}
