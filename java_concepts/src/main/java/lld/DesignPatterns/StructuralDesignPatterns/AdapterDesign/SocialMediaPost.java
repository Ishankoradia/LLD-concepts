package lld.DesignPatterns.StructuralDesignPatterns.AdapterDesign;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialMediaPost {
    private String id;
    private String txt;
    private Long userId;
    private Long timestamp;
}
