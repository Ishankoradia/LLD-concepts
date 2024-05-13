package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign;

public class Client {
    public static void main(String[] args) {
        // If you see here we dont care what is on the left side
        // since all external apis conform to SocialMediaAdapter
        SocialMediaAdapter sm = new FacebookAdapter();
        sm.postFeed((long) 123, "posting facebook feed");

        SocialMediaAdapter sm1 = new TwitterAdapter();
        sm1.postFeed(null, "posting twitter feed");
    }
}
