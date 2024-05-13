package lld.DesignPatterns.StructuralDesignPatterns.FlyweightPattern;

import lombok.Getter;
import lombok.Setter;

// These properties wont change across when the same user plays multiple games
@Getter
@Setter
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}
