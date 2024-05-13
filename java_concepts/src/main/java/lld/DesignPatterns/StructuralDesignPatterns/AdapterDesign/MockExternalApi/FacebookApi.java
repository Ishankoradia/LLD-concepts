package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi;

import static lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.ApiUtils.logFacebookGetPosts;
import static lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign.MockExternalApi.ApiUtils.logFacebookPostStatus;

import java.util.List;

public class FacebookApi {
    public List<FacebookPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        logFacebookGetPosts();
        return List.of(new FacebookPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        logFacebookPostStatus();
    }
}
