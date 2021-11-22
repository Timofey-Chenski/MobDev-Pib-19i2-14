import java.util.Random;

public class Achievement {
    Achievements_pit achievement_description;

    @Override
    public String toString() {
        return "Achievement{" +
                "achievement_description=" + achievement_description +
                '}';
    }

    public Achievements_pit randomDescription() {
        int pick = new Random().nextInt(Achievements_pit.values().length);
        return Achievements_pit.values()[pick];
    }

    public Achievement()
    {
        achievement_description= randomDescription();
    }
}
