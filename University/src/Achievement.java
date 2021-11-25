import java.io.Serializable;
import java.util.Random;

public class Achievement implements Serializable
{
    private static final long serialVersionUID = 2L;

    AchievementsPit achievementDescription;

    @Override
    public String toString() {
        return "Achievement{" +
                "achievementDescription=" + achievementDescription +
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
