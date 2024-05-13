package lld.DesignPatterns.StructuralDesignPatterns.FlyweightPattern;

import lombok.Getter;
import lombok.Setter;

// These properties vary with different games and so will have multiple copies 
// of them pointing to one intrinsic user object 
@Getter
@Setter
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user; // The intrinsic state of the user

    UserExtrinsicState(Colour colour, int currentGameStreak, UserIntrinsicState user) {
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
        this.user = user;
    }
}
