import java.io.Serializable;
import java.util.Random;

public class Achievement implements Serializable
{


    AchievementsPit achievementDescription;

    @Override
    public String toString() {
        return "Achievement{" +
                "achievementDescription=" + achievementDescription.rusVersion +
                '}';
    }

    public AchievementsPit randomDescription() {
        int pick = new Random().nextInt(AchievementsPit.values().length);
        return AchievementsPit.values()[pick];
    }

    public Achievement()
    {
        achievementDescription = randomDescription();
    }
}
